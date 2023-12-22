import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      int a;
      int b;
      b = y;
      y = x;
      x = b;
      a = x;
      x = z;
      z = a;
      System.out.println(x+" "+y+" "+z);
	}
}