import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int tem=0;
		while(sc.hasNext()) {
			int n = sc.nextInt();
			for(int i=0;i<=n;i++) {
				for(int j=0;j<=n;j++) {
					for(int k=0;k<=n;k++) {
						for(int l=0;l<=n;l++) {
							if(i+j+k+l == n)  {
								tem+=1;
								break;
							}
						}
					}
				}
			}

			System.out.printf("%d\n",tem);
			tem=0;
		}
	}
}

