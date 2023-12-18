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
			int length = s.length();
			for (int i=0; i<length; i++) {
				sum += Integer.parseInt(s)%10;
				s = s.valueOf(Integer.parseInt(s)/10);
			}
			System.out.println(sum);
		}
	}
}