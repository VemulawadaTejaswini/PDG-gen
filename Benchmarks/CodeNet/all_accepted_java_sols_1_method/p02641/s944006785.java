import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int N = s.nextInt();
		int[] p = new int[N];
		HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
		for(int i = 0; i < N; i++){
			p[i] = s.nextInt();
			hash.put(p[i], true);
		}

		int minLen = 10000;
		int min = 0;
		for(int i = -200; i < 200; i++){
			if(hash.containsKey(i)) continue;
			if(Math.abs(i-X) < minLen){
				min = i;
				minLen = Math.abs(i-X);
			} 
		}
		System.out.println(min);
		
			
	}
} 