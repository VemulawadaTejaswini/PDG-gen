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
			long a = Long.parseLong(tmp[0]);
			long b = Long.parseLong(tmp[1]);
			data.add(new Cards(a, b));
		}
		
		node start = new node(null, data, 0);
		long[] pes = new long[]{Integer.MAX_VALUE};
		node end = get_cost(start, pes);
		
		System.out.println(end.cost);
	}
	
	public node get_cost(node no, long[] pes){
		int rest = no.cards.size();
		if(rest > 1){
			long opt = no.calcOpt();
			if(opt > pes[0]){
				return null;
			}
			long min = Long.MAX_VALUE;
			node nn = null;
			for(int n=0; n<rest-1; n++){
				long c = Cards.join_cost(no.cards.get(n), no.cards.get(n+1));
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
	long cost;
	node parent;
	public node(node parent, List<Cards> cards, long cost){
		this.parent = parent;
		this.cards = new ArrayList<Cards>(cards);
		this.cost = cost;
	}
	
	public node(node no){
		this.parent = no.parent;
		this.cards = new ArrayList<Cards>(no.cards);
		this.cost = no.cost;
	}
	
	public long calcOpt(){
		long sum = cost;
		List<Cards> data = new ArrayList<Cards>(this.cards);
		while(data.size() != 1){
			long min = Integer.MAX_VALUE;
			long tmp = 0;
			int n = 0;
			for(int i=0; i<data.size()-1; i++){
				long a = data.get(i).above * data.get(i+1).bottom;
				if(min > a){
					min = a;
					tmp = data.get(i).bottom * data.get(i+1).above;
					n = i;
				}
				else if(min == a){
					long b = data.get(i).bottom * data.get(i+1).above;
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
	long above;
	long bottom;
	public Cards(long a, long b){
		this.above = a;
		this.bottom = b;
	}
	
	public long cost(){
		return this.above * this.bottom;
	}
	
	static Cards join(Cards c1, Cards c2){
		return new Cards(c1.above, c2.bottom);
	}
	
	static long join_cost(Cards c1, Cards c2){
		return c1.above * c1.bottom * c2.above * c2.bottom;
	}
}