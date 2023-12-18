import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
        int count = 0;

      while(n>0){
        if(n>=1&&n<=9){count++;}
        else if(n>=100&&n<=999){count++;}
        else if(n>=10000&&n<=99999){count++;}
        n--;
      }
      
      System.out.print(count);
      
	}
}
