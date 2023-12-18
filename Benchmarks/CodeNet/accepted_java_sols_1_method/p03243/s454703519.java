import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		char c = N.charAt(0);
		boolean allsmall = true;
		
		for(int i = 1; i < N.length(); i++){
			if(N.charAt(i) > c) allsmall = false;
		}
		
		for(int i = 0; i < N.length(); i++) System.out.print(allsmall?""+c:""+(char)(c+('2'-'1')));
		System.out.println();
	}
}