import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		 int A  = in.nextInt();
		 int B  = in.nextInt();
		 char nam [] = new char[B];
		 StringBuilder val = new StringBuilder();


		  for(int i= 0; i < A ; i++){
		      String s = in.next();
		      for(int j = 0; j < 2; j ++){
		        System.out.println(s);
		      }
		 }
		
	}
}