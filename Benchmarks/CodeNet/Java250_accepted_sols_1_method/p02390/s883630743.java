import java.util.*;

class Main{

	public static void main(String[] args) {
		Scanner hoge = new Scanner(System.in);

		int a = hoge.nextInt();

		int s = a % 60;
		int huga = (a - s)/60;
		int m = huga % 60;
		int h = huga / 60;

		System.out.println(h + ":" + m + ":" + s);
	}


}