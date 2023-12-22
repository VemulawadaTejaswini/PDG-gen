import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  int d = sc.nextInt();
      int n = sc.nextInt();
      int no=1;
      for(int i=0;i<d;i++){
        no*=100;
      }
      int ans=no;
      for(int i=1;i<n;i++){
        ans+=no;
      }
      if(n==100){
         System.out.println(ans+no);
      }else{
        System.out.println(ans);
      }
    }
}