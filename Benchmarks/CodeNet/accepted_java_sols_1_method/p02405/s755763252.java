import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド
		Scanner sc = new Scanner(System.in);
		while(true) {
		int a;
		a = sc.nextInt();
		int b;
		b = sc.nextInt();
		if(a==0&&b==0) {
			break;
		}

		for(int i = 0;i < a ;i++) {
			for(int j = 0; j < b ;j++) {
				if((i%2==1)&&(j%2==1)) {
					System.out.print("#");
				}else if((i%2==1)&&(j%2==0)) {
					System.out.print(".");
				}else if((i%2==0)&&(j%2==1)) {
					System.out.print(".");
				}else {
					System.out.print("#");
				}
				}
			System.out.println("");
			}
		System.out.println("");
		}

	}
	}

