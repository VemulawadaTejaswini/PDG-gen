import java.util.*;

class Main {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if(n==0) return ;
			int cont = 0, best = 0, ma=-(1<<29);
			for(int i=0; i<n; i++){
				int x = in.nextInt();
				cont = Math.max(0, cont+x);
				best = Math.max(best, cont);
				ma = Math.max(ma, x);
			}
			System.out.println((ma<0)?ma:best);
		}
	}

}