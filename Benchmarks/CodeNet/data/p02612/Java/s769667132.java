import java.util.*;

public class Main {
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
      int p = scn.nextInt();
      int a = p/1000;
      int b = (a+1)*1000;
      int c = p%1000;
      int ans = b-c;
      System.out.println(ans);
	}
}
