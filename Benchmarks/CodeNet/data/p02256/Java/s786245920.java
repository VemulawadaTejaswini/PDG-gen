import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int jy = -1;
		int keisan = 0;
		if(x < y){
			keisan = x;
			x = y;
			y = keisan;
		}
//		System.out.println(x+" "+y);
		while(jy != 0){
			jy = x % y;
			x = y;
			y = jy;
		}
		System.out.println(x);
	}
}