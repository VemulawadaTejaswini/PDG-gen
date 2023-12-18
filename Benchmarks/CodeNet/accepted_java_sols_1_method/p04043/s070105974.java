import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int m1 = Math.min(a,Math.min(b,c));
      int m2 = Math.max(a,Math.max(b,c));
      int n = a+b+c-m1-m2;
      if(m1==5&&n==5&&m2==7)System.out.println("YES");
      else System.out.println("NO");
    }
}
