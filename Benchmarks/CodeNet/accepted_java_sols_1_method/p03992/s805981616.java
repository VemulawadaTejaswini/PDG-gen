import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class Main {
	static Scanner in;
	static char s[];
	public static void main(String[] args) throws FileNotFoundException {
//		in = new Scanner(new File("input.txt"));
		in = new Scanner(System.in);
		s = in.next().toCharArray();
		for(int i = 0;i < s.length;i++){
			if(i == 4) System.out.print(" ");
			System.out.print(s[i]);
		}
		System.out.println();
	}
}