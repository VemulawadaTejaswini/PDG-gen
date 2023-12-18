import java.util.*;
public class Main{
	public static final Scanner sc = new Scanner(System.in);
  	public static void main(String[] args){
    	int n = sc.nextInt();
      	long ans = 0;
      	for (int i=1; i<=3; i++){
        	ans += Math.pow(n, i);
        }
      	System.out.println(ans);
    }
}
