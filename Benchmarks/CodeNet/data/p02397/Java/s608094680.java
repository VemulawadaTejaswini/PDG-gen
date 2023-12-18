import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int i = 0;
		int [] su = new int[3000];//3000超えない
		for (count = 0; count <= su.length ; count+=2) {
			su [count] = scan.nextInt();//配列に数値を代入
			System.out.println(su[count]);
			int x = su [count];
			int y = su [count++];
			if (x == 0 && y == 0) {
					System.out.print(su[i]);
					break;
			}
			System.out.print(su[count]);


				}
			}
		}
