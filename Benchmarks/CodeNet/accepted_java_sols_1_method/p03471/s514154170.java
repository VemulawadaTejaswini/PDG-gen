import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int flag = 0;
		
		int n = sc.nextInt();
		int y = sc.nextInt();
		
		int i,j,k;
		
		for(i=0;i<=n && flag == 0;i++) {
			for(j=0;j<=n-i && flag == 0 ;j++) {
					if (10000*i+5000*j+1000*(n-i-j) == y) {
						System.out.printf("%d %d %d\n",i,j,n-i-j);
						flag = 1;
					}
				}
			}
		
		if(flag == 0) System.out.printf("-1 -1 -1\n");
	}
}
