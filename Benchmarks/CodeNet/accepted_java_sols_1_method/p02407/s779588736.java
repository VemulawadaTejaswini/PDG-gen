import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] b;
		b = new int[a];

		for(int i=0;i<a;i++) {
			b[i] = sc.nextInt();
		}
		for(int j=0;j<a;j++) {
			System.out.printf("%d",b[a-j-1]);
			if(j==a-1)
				break;
			System.out.print(" ");
		}
		System.out.println("");
		
	}
	}

