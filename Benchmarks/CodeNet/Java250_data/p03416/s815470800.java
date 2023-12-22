import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      String num1, num2, num3, num4,num5;
      int ans,t1, t2, t3, t4,t5;
      ans = 0;
      for(;b>=a;a++){
        String s = String.valueOf(a);
        num1 = s.substring(0,1);
        num2 = s.substring(1,2);
        num3 = s.substring(2,3);
        num4 = s.substring(3,4);
        num5 = s.substring(4,5);
        t1 = Integer.parseInt(num1);
        t2 = Integer.parseInt(num2);
        t3 = Integer.parseInt(num3);
        t4 = Integer.parseInt(num4);
        t5 = Integer.parseInt(num5);
        if(t1 == t5 && t2 == t4){
          ans = ans+1;
        }
      }
		  System.out.println(ans);
   }
 }
