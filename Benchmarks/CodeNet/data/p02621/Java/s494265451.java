import java.util.*;
public class Main{
	public static final Scanner sc = new Scanner(System.in);
  	public static void main(String[] args){
    	int n = sc.nextInt();
      	long ans = 1;
      	for (int i=0; i<3; i++){
        	ans += ans*n;
        }
      	System.out.println(ans);
    }
}