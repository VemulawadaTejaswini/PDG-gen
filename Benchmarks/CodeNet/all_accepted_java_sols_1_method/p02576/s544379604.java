import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int X = sc.nextInt();
      int T = sc.nextInt();
      int ans;
      if(N%X==0){
        ans = N/X*T;
      }else{
        ans = (N/X+1)*T;
      }      
       System.out.println(ans);
    }
}