import java.util.Scanner;

class Main {
	public static void main(String[] argv){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h = n/3600;
		int m = (n-h*3600)/60;
		int s = (n-h*3600-m*60);
		System.out.println(h+":"+m+":"+s);
	}
}