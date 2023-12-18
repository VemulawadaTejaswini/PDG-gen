import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int h = x / 3600;
		int m = (x-h*3600) / 60;
		int s = x - (h*3600) - (m*60);
		
		System.out.println(h+":"+m+":"+s);
		
		
	}

}