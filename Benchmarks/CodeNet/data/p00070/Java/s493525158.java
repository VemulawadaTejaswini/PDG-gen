import java.util.*;

public class Main {
	int n, s, count;
	
	@SuppressWarnings("unchecked")
	ArrayDeque<Integer> q = new ArrayDeque();
	
	
	void loop(int a, int b){
		if(a==n){
			if(b==s) count++;
		}else if(b<=s){
			for(int i=0;i<10;i++){
				if(q.contains(i)==false){
					q.push(i);
					loop(a+1,b+(a+1)*i);
					q.pop();
				}
			}
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			count = 0;
			q = new ArrayDeque();
			if(n<11 && s<370) loop(0, 0);
			System.out.println(count);
		}
	}
		
	public static void main(String[] args) {
		new Main.solve();	
	}	
}