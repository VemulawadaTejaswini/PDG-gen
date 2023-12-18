import java.util.*;

public class Main {
	int n, s, count;
	int[][] ans = new int[11][370];
	ArrayDeque<Integer> q = new ArrayDeque<Integer>();
	
	void loop(int a, int b){
		if(a==11) return;
		ans[a][b]++;
		for(int i=0;i<10;i++){
			if(q.contains(i)==false){
				q.push(i);
				loop(a+1,b+(a+1)*i);
				q.pop();
			}
		}
	}
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Main A = new Main();
		A.loop(0,0);
		
		while(sc.hasNext()){
			A.n = sc.nextInt();
			A.s = sc.nextInt();
			if(A.n<11 && A.s<370)
			System.out.println(A.ans[A.n][A.s]);
		}
	}	
}