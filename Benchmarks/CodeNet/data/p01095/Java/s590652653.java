import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0&&n==0) break;
			int[] tansaku = new int[7368792];
			for(int i=0;i<n;++i) {
				for(int j=m;j<=7368791;j+=m) if(tansaku[j]==0) tansaku[j]=1;
				while(tansaku[m]==1) m++;
			}
			System.out.println(m);
		}
	}
}

