import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		int h = time / 3600;
		int m = (time - (h*3600)) / 60;
		int s = time -(h*3600) - m*60;
		System.out.println(h +":" + m + ":" +s);
		
		
	}
}