import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        int ans=0;
        for(int i=1;i*a<=t;i++){
            ans+=b;
        }
        out.println(ans);
	}
}

// int n = sc.nextInt();
// int[] array = new int[n];
// String s = sc.next();
// s.charAt(i)
// out.println();
// Math.min()
