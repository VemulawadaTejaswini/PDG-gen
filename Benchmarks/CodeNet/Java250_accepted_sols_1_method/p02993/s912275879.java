import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char tmp = 'A';
		String result = "Good";
		for(int i = 0;i<line.length();i++) {
			char compChar = line.charAt(i);
			if(tmp == compChar) {
				result = "Bad";
				break;
			}
			tmp = compChar;
		}
		System.out.println(result);
	}
}
	
	