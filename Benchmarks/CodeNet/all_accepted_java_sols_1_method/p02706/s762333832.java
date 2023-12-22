
import java.util.*;

public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int m = sc.nextInt();
   for(int i =1 ; i <=m ;i++) {
	   n-=sc.nextInt();
   }
    if(n>=0)
    System.out.println(n);
    else {
    	System.out.println(-1);
    }
	}

	
}