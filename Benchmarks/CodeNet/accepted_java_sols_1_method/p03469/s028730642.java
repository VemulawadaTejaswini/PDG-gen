import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char s[] = sc.nextLine().toCharArray();
		s[0] = '2'; 
		s[1] = '0'; 
		s[2] = '1'; 
		s[3] = '8';
	   System.out.println(s);	
	}
}