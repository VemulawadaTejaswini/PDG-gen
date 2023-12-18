import java.util;

class Main{
	Scanner scan = null;
	public static void main(String[] args){
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d = a/b;
		int r = a%b;
		float f = a/b;
		System.out.println(d+" "+r+" "+f);
	}
}