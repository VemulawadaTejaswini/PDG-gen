import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int h = a / 3600;
		int m = (a - h * 3600) / 60;
		int s = a - (h * 3600 + m * 60);
		
		System.out.println(h + ":" + m + ":" + s);
		scan.close();
	}
}
