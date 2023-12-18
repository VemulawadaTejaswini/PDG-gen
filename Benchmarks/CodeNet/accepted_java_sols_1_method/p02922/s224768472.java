import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
      
        if((B-1)%(A-1)!=0){System.out.println((B-1)/(A-1)+1);}
      else{System.out.println((B-1)/(A-1));}
   
	}
}