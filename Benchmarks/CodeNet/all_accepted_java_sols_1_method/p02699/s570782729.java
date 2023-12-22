import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int shp = scan.nextInt();
		int wlf = scan.nextInt();
		String ans = "unsafe";
		
		if(shp > wlf){ans = "safe";}
		
		System.out.println(ans);
	}
}