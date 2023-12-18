import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			int xs[] = new int[n];
			for(int i=0; i<n; i++){
				xs[i] = in.nextInt();
			}
			Arrays.sort(xs);
			int total = 0;
			for(int i=1; i<n-1; i++){
				total += xs[i];
			}
			System.out.println(total/(n-2));
		}
	}
	
}