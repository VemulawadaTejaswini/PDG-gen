import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String S = s.next();
	
	int max = 0;
	int count = 0;
	for(int i = 0; i < S.length(); i++){
		if(S.charAt(i) == 'R'){
			count++;
			max = Math.max(max, count);
		}else{
			count = 0;
		}
	}

	

	System.out.println(max);

    
  }
}