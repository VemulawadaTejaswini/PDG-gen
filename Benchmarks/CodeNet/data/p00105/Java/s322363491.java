import java.util.*;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int l = 0, f;
		index[] ind = new index[100];
		List<String> array = new ArrayList<String>();
		
		while(sc.hasNext()){
			String str = sc.next();
			int page = sc.nextInt();
			
			if(l == 0){
				ind[l++] = new index(str, page);
				array.add(str);
			} else {
				f = 0;
				for(int i = 0; i < l; i++){
					if(str.equals(ind[i].getword())){
						ind[i].add(page);
						f = 1;
					}
				}
				if(f == 0){
					ind[l++] = new index(str, page);
					array.add(str);
				}
			}

		}
		Collections.sort(array);
		for(int i = 0; i < l; i++){
		ind[i].sort();
		}

		for(String st: array){
			for(int i = 0; i < l; i++){
				if(st.equals(ind[i].getword())){
					ind[i].print();
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}

class index{
	private String word;
	private int[] list = new int[1000];
	private int l = 0;
	
	public index(String word, int page){
		this.word = word;
		list[l++] = page;
	}
	
	public String getword(){
		return word;
	}
	
	public void add(int page){
		list[l++] = page;
		return ;
	}
	
	public void sort(){
		int t;
		for(int i = l-1; i >= 0; i--){
			for(int j = 1; j <= i; j++){
				if(list[i] < list[i-1]){
					t = list[i];
					list[i] = list[i-1];
					list[i-1] = t;
				}
			}
		}
		
		return ;
	}
	
	public void print(){
		System.out.println(word);
		for(int i = 0, f = 0; i < l; i++){
			if(f == 1){
				System.out.print(" "+list[i]);
			} else {
				System.out.print(list[i]);
				f = 1;
			}
		}
		System.out.println();
	}
}