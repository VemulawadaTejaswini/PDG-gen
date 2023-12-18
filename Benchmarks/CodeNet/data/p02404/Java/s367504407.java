import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		while(0 < 1){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			//上のフレーム
			for(int i = 0;i < b;i++) {
				System.out.printf("#");
			}
			System.out.printf("\n");
			//真ん中
			for(int j = 2;j < a;j++ ) {
				System.out.printf("#");
				for(int k = 2;k < b;k++) {
					System.out.printf(".");
				}
				System.out.printf("#\n");
			}
			//下のフレーム
			for(int i = 0;i < b;i++) {
				System.out.printf("#");
			}
			System.out.printf("\n\n");
		}
		sc.close();
	}	
}
