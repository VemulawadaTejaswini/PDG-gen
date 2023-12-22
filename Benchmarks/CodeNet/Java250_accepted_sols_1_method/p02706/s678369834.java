import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int a;
      int sum = 0;
      for(int i = 0;i<m;i++){
         a = sc.nextInt();
         sum += a;
      }
      if(n>=sum){
         System.out.println(n-sum);
      }else{
         System.out.println(-1);
      }
	}
}