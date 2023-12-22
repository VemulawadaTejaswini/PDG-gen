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
		
		int[] array = new int[n];
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
			min = Math.min(min, array[i]);
		}
		
		int count = 0;
		LOOP:
		for(int i = 1; i <= min; i++){
			for(int a = 0; a < n; a++){
				if(array[a] % i != 0){
					continue LOOP;
				}
			}
			
			System.out.println(i);
		}
		
	}

}