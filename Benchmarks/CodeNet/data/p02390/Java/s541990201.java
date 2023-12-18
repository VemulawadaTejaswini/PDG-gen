import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int S = src.nextInt();
		int s = (S%3600)%60;
		int m = (S%3600)/60;
		int h = S/3600;
		
		System.out.println(h+":"+m+":"+s);
	}

}