import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;    //第一个数据
		int b;    //第二个数据
		while(in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			a = a+b;
			String str = String.valueOf(a);
			System.out.println(str.length());
		}
		in.close();
	}
}
