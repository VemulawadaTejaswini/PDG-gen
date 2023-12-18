import java.util.*;

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a = Integer.parseInt(sc.next());
	    int b = Integer.parseInt(sc.next());
	    
	    int sum_1 = a + a - 1;
	    int sum_2 = b + b - 1;
	    int sum_3 = a + b;
	    
	    int ans = Math.max(sum_1, Math.max(sum_2, sum_3));
	    
	    System.out.println(ans);
	}
}
