import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n+m==0)break;
			int[] t = new int[n+1];
			int sumt = 0;
			for(int i=1;i<=n;i++) {
				t[i] = sc.nextInt();
				sumt += t[i];
			}
			
			int[] h = new int[m+1];
			int sumh = 0;
			for(int i=1;i<=m;i++) {
				h[i]  = sc.nextInt();
				sumh += h[i];
			}
			
			int Git=101;int Gih=101;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=m;j++) {
					if(sumt-t[i]+h[j] == sumh-h[j]+t[i] && Git+Gih > t[i]+h[j]) {
						Git=t[i];
						Gih=h[j];
					}
				}
			}
			if(Git + Gih == 202)
				System.out.println("-1");
			else System.out.println(Git + " " + Gih);
			
		}
		
	}
}
