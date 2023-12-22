import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		final int W= cin.nextInt();
		final int H= cin.nextInt();
		int x= cin.nextInt();
		int y= cin.nextInt();
		int r= cin.nextInt();
		
		if( x-r>=0 && x+r<=W && y-r>=0 && y+r<=H ){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}