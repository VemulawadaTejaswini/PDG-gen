import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double t1 = 0;

		t1 = n/1.08;

		int t2 = (int)t1;
		int t3 = 0;
		int t4 = 0;

		if(t1-t2==0){
			System.out.println(t2);
		}else {
			t3 = t2 + 1;
			t4 = (int)(t3*1.08);
			if(t4==n) {
				System.out.println(t3);
			}else {
				System.out.println(":(");
			}
		}
	}

}
