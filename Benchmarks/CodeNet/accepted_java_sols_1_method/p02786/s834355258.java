import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long c = 0;
        while(n != 0){
        	n /= 2;
            ans += (long)Math.pow(2, c);
            c++;
        }
        System.out.println(ans);
	}
}