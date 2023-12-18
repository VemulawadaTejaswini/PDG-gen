import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {


    public static void main(String[] args) {
    
  Scanner scan = new Scanner(System.in);
  
  int n = scan.nextInt();
  
  long [] a = new long [n];
  
  for(int num =0; num<n; num++) {
	  long line = scan.nextLong();
	  a[num] = line;
  }
  
  long ans = 1;
  
  for(int i=0; i<n; i++) {
	  ans *= a[i];
  }
  
  if(ans >= Math.pow(10, 18)) System.out.println("-1");
  else System.out.println(ans);
  
  
    }
    
}