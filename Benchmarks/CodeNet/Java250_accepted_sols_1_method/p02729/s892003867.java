import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
        int total = N + M ;
        int count =0;
        int ref = N;
        
        while(ref > 0){
            count += ref;
            ref--;
        }
        count = count - N;
        int ref1= M;
        int c =0;
        while(ref1 > 0){
            c = c + ref1;
            ref1--;
        }
        c = c - M;
        System.out.println(count + c);
	}
}
