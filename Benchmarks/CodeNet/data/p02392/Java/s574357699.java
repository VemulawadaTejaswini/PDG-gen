import java.util.*;

public class Main{

	public static void main (String[] args) throws java.io.IOException{

		int x,y,z;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if(x < y && y < z){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}