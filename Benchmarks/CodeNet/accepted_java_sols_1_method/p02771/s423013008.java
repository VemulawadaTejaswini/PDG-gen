import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        if(A == B && B != C && A != C){
            System.out.println("Yes");
        }else if(A != B && B == C && A != C){
            System.out.println("Yes");
        }else if(A != B && B != C && A == C){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
		
	}
} 