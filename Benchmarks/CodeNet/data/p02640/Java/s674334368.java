import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int X = inputs.nextInt();
		int Y = inputs.nextInt();
		if((Y-2*X)%2==0&&(Y-2*X)/2<=X) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
