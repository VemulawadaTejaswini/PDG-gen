import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int sum = 0;
			String s = stdIn.nextLine();
			if(s.charAt(0) == '0')
				break;
			for (int i=0; i<s.length(); i++) {
				sum += Integer.parseInt(""+s.charAt(i));
			}
			System.out.println(sum);
		}
	}
}