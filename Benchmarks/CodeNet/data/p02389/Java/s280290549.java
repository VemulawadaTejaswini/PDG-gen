import java.util.Scanner;

class Main{
	public static void main(String[] args){
	
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int y = a.nextInt();
		System.out.println(x*y + "" + (x*2+y*2));
	}
}