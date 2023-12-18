import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int tem=0;
		while(sc.hasNext()) {
			int n = sc.nextInt();
			for(int i=9;i>=0;i--) {
				for(int j=9;j>=0;j--) {
					for(int k=9;k>=0;k--) {
						for(int l=9;l>=0;l--) {
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


