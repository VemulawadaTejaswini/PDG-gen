import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int Rmin=1000000,Lmax=0,buff;
		for(int i=0;i<m;i++) {
			buff=sc.nextInt();
			if(buff>Lmax) {
				Lmax=buff;
			}
			buff=sc.nextInt();
			if(buff<Rmin) {
				Rmin=buff;
			}
		}
		System.out.println(Math.max(0, Rmin-Lmax+1));

	}
}


