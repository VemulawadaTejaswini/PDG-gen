import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	String S = s.next();

	int count = 0;
	int abc = 0;
	for(int i = 0; i < S.length()-2; i++){
		if(S.charAt(i) == 'A' && S.charAt(i+1) == 'B' && S.charAt(i+2) == 'C'){
			count++;
		}
		
	}
	System.out.println(count);
    
  }
}