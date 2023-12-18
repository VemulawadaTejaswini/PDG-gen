import java.util.Scanner;

public class Main{
	public static void main(String[] args){		//メソッド宣言
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			long SUM = 0;
			int MAX = -9999999;
			int MIN = 9999999;

			for(int i = 0; i < n ; i++) {
				int num = sc.nextInt();
				MAX = num>MAX ? num:MAX;

				MIN = num<MIN ? num:MIN;

				SUM += num;
			}
				System.out.println(String.format("%d %d %d",MIN,MAX,SUM));
		}
	}
}



