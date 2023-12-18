import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int w = input.nextInt();
		
		System.out.println(h * w + " " +( (w * 2) + (h * 2)));
	}
}