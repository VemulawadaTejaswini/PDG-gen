import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        long A = s.nextLong();
        long B = s.nextLong();
        long N = s.nextLong();
        long max = 0;
        long SSS;
        if(B-1 <= N){
            SSS = B-1;
        }else{
            SSS = N;
        }
        
        
        max = (A*SSS)/B;
        

        System.out.println(max);
	}
} 