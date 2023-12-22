
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();


		int count=0;
		while (true){
			if(x-z<0) {
				count--;
				break;
			}
			x=x-z;
			if(x-y<0) break;
			x=x-y;
			count++;
		}

		System.out.println(count);
	}

}
