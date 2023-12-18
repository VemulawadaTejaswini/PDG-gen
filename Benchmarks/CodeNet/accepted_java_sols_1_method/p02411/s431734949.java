import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;){
				int m = sc.nextInt();
				int f = sc.nextInt();
				int r = sc.nextInt();
				if(m == -1 && f == -1 && r == -1)break;
				int sum = m + f;
				if(m == -1 || f == -1) {
					System.out.println("F");
				}else if(sum >= 80) {
					System.out.println("A");
				}else if(sum >= 65 && sum <= 80) {
					System.out.println("B");
				}else if(sum >= 50 && sum <= 65) {
					System.out.println("C");
				}else if(sum >= 30 && sum <= 50) {
					if(r >= 50) {
						System.out.println("C");
					}else
						System.out.println("D");
				}else if(sum < 30){
					System.out.println("F");
				}
			}
		}
	}
}
