import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      double n = sc.nextInt();
	  double cnt = 0;
      
      for(int i=1;i<=n;i++){
      	if(i%2 == 1){
        	cnt++;
        }
      }
      double ans = 0;
      ans = cnt / n;
      System.out.println(ans);
      
    }
}