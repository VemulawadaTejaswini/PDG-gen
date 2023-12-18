import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		scan.close();

		int h;
		int m;
		int s;

		s = num%60;
		m = num/60%60;
		h = num/60/60;

		System.out.println(h + ":" + m + ":" + s);
	}

}