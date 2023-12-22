import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long w = sc.nextLong();		
        long h = sc.nextLong();
		long x = sc.nextLong();
        long y = sc.nextLong();
        double ans1 = w*h/2.0;
        int ans2 = 0;
        if(x*2==w && y*2==h){ans2++;}
		System.out.println(ans1 + " " + ans2);
	}
}
