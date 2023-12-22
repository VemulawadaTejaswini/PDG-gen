import java.util.*;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int t = sc.nextInt();
      int sum = (int)((t+0.5)/a)*b;
      System.out.println(sum);
        sc.close();
    }
}
