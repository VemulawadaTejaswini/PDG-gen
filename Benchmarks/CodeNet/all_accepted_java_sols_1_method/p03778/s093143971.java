import java.io.File;
import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b >= a + W) System.out.println((b - (a + W)));
		else if(a >= b + W) System.out.println((a - (b + W)));
		else System.out.println(0);
	}
}