import java.util.*;

public class Main {
	int n, s, count;
	ArrayDeque<Integer> q = new ArrayDeque<Integer>();
	
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
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			Main A = new Main();
			A.n = sc.nextInt();
			A.s = sc.nextInt();
			if(A.n<11 && A.s<370) A.loop(0, 0);
			System.out.println(A.count);
		}
	}	
}