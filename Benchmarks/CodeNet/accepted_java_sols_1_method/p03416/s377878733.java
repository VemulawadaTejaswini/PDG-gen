import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		
		for(int i = A; i <= B; i++){
			String s = String.valueOf(i);
			boolean tf = true;
			//System.out.println(s + ":");
			for(int j = 0; j < s.length()/2; j++){
				//System.out.print(s.charAt(j));
				if(s.charAt(j) != s.charAt(s.length()-1-j)){
					tf = false;
					break;
				}
			}
			//System.out.println();
			if(tf) ans++;
		}
		
		System.out.println(ans);
	}
}