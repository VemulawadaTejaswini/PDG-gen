import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		int max =0;
		max = Math.max(a, b);
		max=Math.max(max, c);
		int nibai = max;
		for(int i=0;i<k;i++) {
			nibai =  nibai* 2;
		}
		System.out.println(nibai+a+b+c-max);
	}

}
