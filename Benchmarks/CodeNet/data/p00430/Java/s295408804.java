import java.util.*;

public class Main {
	int n;
	ArrayList<Integer> list;
	
	void loop(int x){
		for(int i=n-x;i>0;i--){
			if(list.size()==0 || list.get(list.size()-1)>=i){
				list.add(i);
				if(x+i==n) print();
				else loop(x+i);
				list.remove(list.size()-1);	
			}
		}
	}
	
	void print(){
		for(int i=0;i<list.size();i++){
			if(i!=0) System.out.print(" ");
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			list = new ArrayList<Integer>();
			loop(0);
		}
	}
	
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}