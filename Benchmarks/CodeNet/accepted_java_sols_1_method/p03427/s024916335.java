import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long ketasuu=1;
		long saidai =0;
		long kari=n;
		boolean hantei = true;

		while(true) {
			if(kari<10) {
				break;
			}
			kari=kari/10;
			ketasuu++;
		}

		for(int i=0;i<ketasuu-1;i++) {
			if(n%10!=9) {
				System.out.print(ketasuu*9-9+kari-1);
				hantei=false;
				break;
			}
			n=n/10;
		}
		if(hantei) {
			System.out.print(ketasuu*9-9+kari);
		}

	}

}
