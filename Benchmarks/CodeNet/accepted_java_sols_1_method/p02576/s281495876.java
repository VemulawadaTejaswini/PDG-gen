import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int X = s.nextInt();
	int T = s.nextInt();
	
	if(N%X == 0){
		System.out.println(T*(N/X));
	}else{
		System.out.println(T*(N/X+1));
	}
	

    
  }
}