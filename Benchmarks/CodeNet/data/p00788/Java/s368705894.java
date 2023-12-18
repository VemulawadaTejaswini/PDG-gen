import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			double p = Math.sqrt(sc.nextDouble());
			int n = sc.nextInt();
			if(p == 0 && n == 0) break;

			double max = 1 / (double)n;
			double min = (double)n;
			int max_p = 1;
			int max_q = n;
			int min_p = n;
			int min_q = 1;

			for(int i=1;i<=n;i++){
				int j1 = (int)Math.floor(i * p);
				int j2 = (int)Math.ceil(i * p);

				if(j1 <= n && (double)j1/i > max){
					max = (double)j1/i;
					max_p = j1;
					max_q = i;
				}
				if(j2 <= n && (double)j2/i < min){
					min = (double)j2/i;
					min_p = j2;
					min_q = i;
				}
			}

			System.out.printf("%d/%d %d/%d\n",min_p,min_q,max_p,max_q);
		}
	}
}