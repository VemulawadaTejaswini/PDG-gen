import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		int c = sc.nextInt();
        int d = 0;
        for (int i= b; i<= c; i++) {
          if (i % a == 0) {
       		d = 1;
            }
        }
      if (d == 0) {
        System.out.println("NG");
        } else {
        System.out.println("OK");
      }
	}
}