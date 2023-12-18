import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			int a=0;
			if(n==0 && x==0) {
				break;
			}else {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					for(int k=1;k<=n;k++) {
						if(i+j+k==x) {
							if(i<j && j<k) {
							a+=1;

							}
						}
					}
				}
			}System.out.println(a);
			}

		}
	}
}
