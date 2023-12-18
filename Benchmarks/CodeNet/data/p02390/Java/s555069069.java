import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int S=in.nextInt();
		int h=S/3600;
		int h1=S%3600;
		int m=h1/60;
		int m1=h1%60;
		System.out.println(h+":"+m+":"+m1);
	}
	
}

