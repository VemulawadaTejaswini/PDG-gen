import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	   int d = sc.nextInt();
      int cnt1 = 0;
      int cnt2 = 0;
      while(a>0){
         cnt1++;
         a-=d;
      }
      while(c>0){
         cnt2++;
         c-=b;
      }
      if(cnt1>=cnt2){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
	}
}
