import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int r = 0;
		int D = 0;
		int x = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		r = Integer.parseInt(sc.next());
		D = Integer.parseInt(sc.next());
		x = Integer.parseInt(sc.next());
		int i;
		for(i=0;i<10;i++){
			x=r*x-D;
			System.out.println(x);
		}

	}

}
