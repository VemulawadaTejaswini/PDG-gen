import java.util.Scanner;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();	
		int y = in.nextInt();
		System.out.printf("%d %d %.8f\n",(int)x/y, x%y,x/(double)y);
	}
}