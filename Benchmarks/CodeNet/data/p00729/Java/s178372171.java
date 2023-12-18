import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int r = sc.nextInt();
			int[][] map = new int[m+1][n+1];
			int[][] rec = new int[m+1][721];
			int a, b, c, d;
			for(int i=0;i<r;i++){
				a = sc.nextInt()-540;
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				if(d==1) map[c][b] = a;
				else{
					for(int j=map[c][b]+1;j<=a;j++) rec[c][j]++;
				}
			}
			
			int q = sc.nextInt();
			int sum;
			for(int i=0;i<q;i++){
				a = sc.nextInt()-540;
				b = sc.nextInt()-540;
				c = sc.nextInt();
				sum = 0;
				for(int j=a+1;j<=b;j++){
					if(rec[c][j]>0) sum++;
				}
				System.out.println(sum);
			}
		}	
	}	
}