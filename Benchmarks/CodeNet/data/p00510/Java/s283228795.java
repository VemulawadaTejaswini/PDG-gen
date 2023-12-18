import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int cur = sc.nextInt();
		int max = cur;
		for(int i = 0; i < n; i++){
			final int in = sc.nextInt();
			final int out = sc.nextInt();
			
			cur = cur + in - out;
			
			if(cur < 0){
				System.out.println(0);
				return;
			}
			
			max = Math.max(max, cur);
		}
		
		System.out.println(max);
	}

}