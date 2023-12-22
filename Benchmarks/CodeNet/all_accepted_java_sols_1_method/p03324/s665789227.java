import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int d = scn.nextInt();
		int n = scn.nextInt();
      	int ans = 0;
        int dd = (int)Math.pow(100,d);
        ans = dd*n;
      	if(n==100){
      		ans = ans + dd;
    	}
      	System.out.println(ans);
	}
}
