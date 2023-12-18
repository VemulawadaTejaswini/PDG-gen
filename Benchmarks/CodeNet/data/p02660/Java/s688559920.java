import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		int count = 0;
		long i = 2;
		long j = 2;
		while(j <= 1000000){
			i = j;
			while(N%i == 0L){
				N = N/i;
				count++;
				i = i*i;
			}
			j++;
		}
		if(count == 0){
			System.out.println(1);
		}else{
			System.out.println(count);
		}
	}
} 