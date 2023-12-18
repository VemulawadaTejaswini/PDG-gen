import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int ind = Math.max(a, b);
		
		boolean flag = false;
		int ans = 0;
		
		for(int i = 1; i < ind; ++i) {
		    if(Math.abs(a - i) == Math.abs(b - i)){
		        flag = true;
		        ans = i;
		        break;
		    }
		    else flag = false;
		}
		if(flag) System.out.println(ans);
		else System.out.println("IMPOSSIBLE");
		
	}
}