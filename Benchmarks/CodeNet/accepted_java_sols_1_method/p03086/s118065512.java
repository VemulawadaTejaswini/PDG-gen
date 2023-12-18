import java.util.*;
import java.io.*;
 
public class Main {
 
  public static void main(String[] args)throws IOException {
	  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	  String S = br.readLine();
	  int temp = 0;
	  int counter = 0;
	  for(int i =0; i<S.length(); i++) {
		  if(S.charAt(i) == 'A' || S.charAt(i) == 'C' || S.charAt(i) == 'G' || S.charAt(i) == 'T' ) {
			  counter++;
		  } else {
			 temp = Math.max(temp, counter++);
			 counter = 0;
		  }
	  }
	  temp = Math.max(temp, counter);
	  System.out.println(temp);
  }
}