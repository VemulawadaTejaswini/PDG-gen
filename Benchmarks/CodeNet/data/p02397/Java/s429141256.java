import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する


class Main{
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		try (Scanner sc = new Scanner(System.in)) {
			while(x != 0 || y !=0) {
				x = sc.nextInt();
				y = sc.nextInt();
			if(x == 0 && y == 0)break;
			else if(x > y) {
				System.out.println(String.format("%d %d",y,x));
			}else {
			    System.out.println(String.format("%d% d",x ,y));
			}
			}
		}
	}
}

