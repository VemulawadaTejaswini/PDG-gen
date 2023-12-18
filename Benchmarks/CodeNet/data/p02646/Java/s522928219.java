import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int v = sc.nextInt();
      	int b = sc.nextInt();
      	int w = sc.nextInt();
      	int t = sc.nextInt();
      	for(int cnt = 0;cnt < t;cnt++){
        	a += v;
          	b += w;
          	if(a == b){
            	System.out.println("YES");
              	System.exit(0);
            }
        }
      	System.out.println("NO");
    }
}