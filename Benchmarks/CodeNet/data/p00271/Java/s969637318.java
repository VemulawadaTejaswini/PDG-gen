import java.util.Scanner;

public class Main {

	public void kion() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a - b);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Main p = new Main();
        for(int i =0;i <= 6;i++) {
        p.kion();
	  }
   }
}