import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = 0;
      	int n = x / 100;
      	int m = x % 100;
      	
      	if(x >= 2000){
      	    res = 1;
      	}else if(m <= 5 * n){
      	    res = 1;
      	}
        
      	System.out.println(res);
    }
}
