import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n =sc.nextInt();
				int q=sc.nextInt();
				if(n+q==0) break;
				int [] data=new int[101];
				int max=q;
				for(int i=0; i<n; i++) {
					int m=sc.nextInt();
					for(int j=0; j<m; j++) {
						int k=sc.nextInt();
						data[k]++;
						max=Math.max(max, data[k]);
					}
				}
				int ans=0;
				for(int i=1; i<100; i++) {
					if(data[i]>=max) {
						ans=i;
						break;
					}
				}
				System.out.println(ans);
				
			}

		}
	}
}
