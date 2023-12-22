import java.util.*;
public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       	int cnt = 0;
        if(a % 10 == 1) cnt++;
      	a /= 10;
      	if(a % 10 == 1) cnt++;
      	a /= 10;
      	if(a % 10 == 1) cnt++;
      	System.out.println(cnt);
	}
}
        
        