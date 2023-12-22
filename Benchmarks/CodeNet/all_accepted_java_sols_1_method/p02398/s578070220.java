import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{
		public static void main(String[] args){
			int a = 0;
			int b = 0;
			int c = 0;
			int z = 0;
			try(Scanner sc = new Scanner(System.in)){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				for(int x=a;x <= b;x++) {

					if(c % x == 0)
						z++;
					}
				System.out.println(String.format("%d",z));
			}
		}
}

