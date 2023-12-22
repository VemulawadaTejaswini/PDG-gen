import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String cnt;
        
        if(b - a <= 0)cnt = "delicious";
        else if(b - a > 0 && b - a <= x)cnt = "safe";
        else cnt = "dangerous";
        
        System.out.println(cnt);
	  }
}