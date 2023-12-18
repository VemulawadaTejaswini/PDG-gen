import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int size = Integer.parseInt(line);
		List<Cards> data = new ArrayList<Cards>();
		for(int i=0; i<size; i++){
			line = in.readLine();
			String[] tmp = line.split(" ");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			data.add(new Cards(a, b));
		}
		
		node start = new node(null, data, 0);
		int[] pes = new int[]{Integer.MAX_VALUE};
		node end = get_cost(start, pes);
		
		System.out.println(end.cost);
	}
	
	public node get_cost(node no, int[] pes){
		int rest = no.cards.size();
		if(rest > 1){
			int opt = no.calcOpt();
			if(opt > pes[0]){
				return null;
			}
			int min = Integer.MAX_VALUE;
			node nn = null;
			for(int n=0; n<rest-1; n++){
				int c = Cards.join_cost(no.cards.get(n), no.cards.get(n+1));
				List<Cards> temp = new ArrayList<Cards>(no.cards);
				temp.set(n+1, Cards.join(no.cards.get(n), no.cards.get(n+1)));
				temp.remove(n);
				node newno = new node(no, temp, no.cost+c);
				node res = get_cost(newno, pes);
				if(res==null) continue;
				if(min > res.cost){
					min = res.cost;
					nn = new node(res);
				}
			}
			return nn;
		}else{
			if(pes[0] > no.cost){
				pes[0] = no.cost;
			}
			return no;
		}
	}
}

class node{
	List<Cards> cards;
	int cost;
	node parent;
	public node(node parent, List<Cards> cards, int cost){
		this.parent = parent;
		this.cards = new ArrayList<Cards>(cards);
		this.cost = cost;
	}
	
	public node(node no){
		this.parent = no.parent;
		this.cards = new ArrayList<Cards>(no.cards);
		this.cost = no.cost;
	}
	
	public int calcOpt(){
		int sum = cost;
		List<Cards> data = new ArrayList<Cards>(this.cards);
		while(data.size() != 1){
			int min = Integer.MAX_VALUE;
			int tmp = 0;
			int n = 0;
			for(int i=0; i<data.size()-1; i++){
				int a = data.get(i).above * data.get(i+1).bottom;
				if(min > a){
					min = a;
					tmp = data.get(i).bottom * data.get(i+1).above;
					n = i;
				}
				else if(min == a){
					int b = data.get(i).bottom * data.get(i+1).above;
					if(tmp < b){
						tmp = b;
						n = i;
					}
				}
			}
			sum += min * tmp;
			data.set(n+1, new Cards(data.get(n).above, data.get(n+1).bottom));
			data.remove(n);
		}
		return sum;
	}
}

class Cards{
	int above;
	int bottom;
	public Cards(int a, int b){
		this.above = a;
		this.bottom = b;
	}
	
	public int cost(){
		return this.above * this.bottom;
	}
	
	static Cards join(Cards c1, Cards c2){
		return new Cards(c1.above, c2.bottom);
	}
	
	static int join_cost(Cards c1, Cards c2){
		return c1.above * c1.bottom * c2.above * c2.bottom;
	}
}