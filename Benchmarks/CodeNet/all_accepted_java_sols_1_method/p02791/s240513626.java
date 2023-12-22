import java.util.*;
 
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] P = new int[N];
        for(int i = 0; i < N; i++){
            P[i] = s.nextInt();
        }
        
        int min = N+1;
        int count = 0;
        for(int i = 0; i < N; i++){
            if(min > P[i]){
                min = P[i];
                count++;
            }
        }
        System.out.println(count);
	}
} 