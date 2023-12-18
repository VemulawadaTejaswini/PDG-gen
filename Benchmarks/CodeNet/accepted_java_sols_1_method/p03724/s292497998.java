import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int M = io.nextInt();
		boolean[] node = new boolean[N];
		int a,b;
		for(int i=0;i<M;i++){
			a = io.nextInt()-1;
			b = io.nextInt()-1;
			node[a] = !node[a];
			node[b] = !node[b];
		}
		
		String ans = "YES";
		for(int i=0;i<N;i++){
			if(node[i]) ans = "NO";
		}
		System.out.println(ans);
	}
		
}