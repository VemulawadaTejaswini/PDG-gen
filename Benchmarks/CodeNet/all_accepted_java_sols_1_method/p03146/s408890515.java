import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int s = sc.nextInt();
      int m =0;
      int[] a = new int[10000];
      a[0] = s;
      for (int i=1; i<10000; i++) {
        if(s % 2 == 0) {
          s /= 2;
          a[i] = s;
        } else {
          s = s * 3 + 1;
          a[i] = s;
        }
        for (int j=0; j<i; j++) {
          if(a[i] == a[j]) {
            m = i+1;
            break;
          }
        }
        if (m != 0) break;
      }
      System.out.println(m); 
    }
}