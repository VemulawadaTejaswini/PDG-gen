import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int n = sc.nextInt();
      	int l = sc.nextInt();
      	int ans = (2*l+n-1)*n/2;
      	int e;
      
      	if(l*(l+n-1) <= 0) e = 0;
      	else if(Math.abs(l) < Math.abs(l+n-1)) e = l;
      	else e = l+n-1;
      
      	ans -= e;
      	System.out.println(ans);
	}
}