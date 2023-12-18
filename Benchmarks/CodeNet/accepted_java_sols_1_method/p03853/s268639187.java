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
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		for(int i = 0; i < H; i++){
			String s = sc.next();
			System.out.println(s+"\n"+s);
		}
	}
}