import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		if((100*R+10*G+B)%4==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
