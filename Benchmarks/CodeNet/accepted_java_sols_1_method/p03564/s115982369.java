import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
      	int k = in.nextInt();
      	int nam = 1;
      
      for(int i =0;i < n ;i++){
        nam = Math.min(nam*2,nam+k);
      }
      System.out.print(nam);
	}
}