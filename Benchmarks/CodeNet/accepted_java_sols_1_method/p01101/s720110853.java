import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				int m=sc.nextInt();
				if(n==0 && m==0) break;
				int[] a=new int[n+1];
				int sum=0;
				int max=0;
				for(int i=0; i<n; i++) {
					a[i]=sc.nextInt();
				}
				for(int i=0; i<n; i++) {
					for(int j=i+1; j<n; j++) {
						sum=a[i]+a[j];
						if(sum<=m) {
							max=Math.max(sum, max);
						}
					}
				}
				if(max==0) {
					System.out.println("NONE");
				}
				else {
					System.out.println(max);
				}
			}
		}
	}
}

