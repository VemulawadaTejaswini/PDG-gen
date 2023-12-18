import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		int count = 0;
        for(int i = 2; i <= N; i++){
			if(N%i == 0){
				N = N/i;
				count++;
			}else{
				continue;
			}
		}
		System.out.println(count);
	}
} 