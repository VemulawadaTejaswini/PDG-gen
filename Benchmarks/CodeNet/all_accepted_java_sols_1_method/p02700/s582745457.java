import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hA = sc.nextInt();
		int dA = sc.nextInt();
		int hB =sc.nextInt();
		int dB= sc.nextInt();
		while(hA > 0 && hB > 0) {
			hB-=dA;
			if(hB<1) {
				System.out.println("Yes");
			}else {
				hA-=dB;
				if(hA<1) {
					System.out.println("No");
				}
			}
		}
	}

}
