import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		euclid(x,y);
	}
	public static void euclid(int x , int y)
	{
		int temp;
		if (x == 0 || y == 0) {
			System.out.println((x+y));
			return ;
		}
		if(x < y){
			temp = x;
			x = y;
			y = temp;
		}
		
		euclid(y,x % y);
	}
}