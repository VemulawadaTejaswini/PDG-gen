import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int i = 1;


		while(i <= n){
			int x = i;

			if(x % 3 == 0){
				System.out.print(" " + x);
			}else{
				if(x % 10 == 3){
					System.out.print(" " + x);
				}else{
					x /= 10;
				}
			}

			i++;
		}
		System.out.println();

	}

}
