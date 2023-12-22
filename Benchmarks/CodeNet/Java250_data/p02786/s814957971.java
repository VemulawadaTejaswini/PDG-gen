import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		long h=sc.nextLong();
		long cnt=1;
		while(h > 1){
			h=h/2;
			cnt*=2;
		}
		System.out.println(2*cnt-1);
	}
}