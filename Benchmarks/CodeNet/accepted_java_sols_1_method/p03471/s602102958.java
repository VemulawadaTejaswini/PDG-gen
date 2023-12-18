import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO ABC_085_C
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int Y = sc.nextInt();
		// Scannerクラスのインスタンスをクローズ
		sc.close();

		int maiX=0, maiY=0, maiZ=0;
		int kaiX=-1, kaiY=-1, kaiZ=-1;


		for(maiX = 0; maiX <= N; maiX++) {
			if(kaiX != -1) {
				break;
			}
			if(maiX * 10000 > Y) {
				break;
			}

			for(maiZ = 0; maiX + maiZ <= N; maiZ++) {

				maiY = N - (maiX + maiZ);
				if(maiX * 10000 + maiY * 5000 + maiZ * 1000 == Y) {
					kaiX = maiX;
					kaiY = maiY;
					kaiZ = maiZ;
					break;
				}
			}
		}

		System.out.println(kaiX + " " + kaiY + " " + kaiZ);
	}
}
