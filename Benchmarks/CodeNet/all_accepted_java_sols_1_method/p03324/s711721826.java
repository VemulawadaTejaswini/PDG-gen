import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int d = sc.nextInt();
        int n = sc.nextInt();
        int ans = n;
        int num = 0;
        num = (int)Math.pow(100, d);
        ans = num * n;
        if(n == 100){
        	System.out.println(ans + num);
        }else{
        	System.out.println(ans);
        }
    }
}