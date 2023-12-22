import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		sc.close();
		if(x>y) System.out.println("a > b");
		else if(x<y) System.out.println("a < b");
		else System.out.println("a == b");
	}
}