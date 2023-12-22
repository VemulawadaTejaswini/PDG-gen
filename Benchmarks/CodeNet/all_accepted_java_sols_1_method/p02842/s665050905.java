import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int N = Integer.parseInt(scanner.nextLine());
		int largeN = N*100;
		int a[] = new int[25];
		Boolean isOK = false;
		for(int i = 0; i < 25; i++) {
			a[i] = largeN + i*8;
			if(i > 12) {
				a[i] -= 100;
			}
			if(a[i] % 108 == 0) {
				isOK = true;
				System.out.println(a[i] / 108);
				break;
			}
		}

		if(!isOK) {
			System.out.println(":(");
		}


	}

}
