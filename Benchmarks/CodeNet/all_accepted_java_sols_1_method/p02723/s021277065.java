import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		String s = inputs.next();
		if(s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
