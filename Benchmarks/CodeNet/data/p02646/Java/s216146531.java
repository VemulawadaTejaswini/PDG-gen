import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
		int dis = Math.abs(a - b);
		int sp = v - w;
		if(sp <= 0){
			System.out.println("NO");
			System.exit(0);
		}
		if(dis / sp <= t){
		System.out.println("YES");
		}
		else if((dis / sp == t) && !(dis % sp == 0)){
		System.out.println("NO");
		}else{
		System.out.println("NO");
		}
    }
}