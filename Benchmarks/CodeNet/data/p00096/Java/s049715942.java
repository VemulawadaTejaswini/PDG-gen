import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int tem=0;
		while(sc.hasNext()) {
			int n = sc.nextInt();
			for(int i=1000;i>=0;i--) {
				for(int j=1000;j>=0;j--) {
					for(int k=1000;k>=0;k--) {
						for(int l=1000;l>=0;l--) {
							if(i+j+k+l == n)  tem+=1;
						}
					}
				}
			}

			System.out.printf("%d\n",tem);
			tem=0;
		}
	}
}

