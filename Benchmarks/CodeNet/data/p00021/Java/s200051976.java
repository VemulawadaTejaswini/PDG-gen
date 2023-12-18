import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		for(int i=0;i<n;i++){
			//scan.nextLine();
			float x1,y1,x2,y2,x3,y3,x4,y4;
			x1= scan.nextFloat();
			y1= scan.nextFloat();
			x2= scan.nextFloat();
			y2= scan.nextFloat();
			x3= scan.nextFloat();
			y3= scan.nextFloat();
			x4= scan.nextFloat();
			y4= scan.nextFloat();
			if((y2-y1)*(x4-x2)==(y4-y3)*(x2-x1)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}