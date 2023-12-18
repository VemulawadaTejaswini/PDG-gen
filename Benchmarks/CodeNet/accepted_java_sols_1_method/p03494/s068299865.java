import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] a = new int[N];
    boolean fg = true;
    int count = 0;
    
    for (int i=0;i<a.length; i++) {
      a[i] = sc.nextInt();
    }
    
    do {
      for (int j=0; j<a.length; j++) {
          if (a[j]%2 != 0) {
              fg = false;
          }
      }

      if (fg == true) {
        for (int i=0; i<a.length; i++) {
          a[i] = a[i]/2;
        }
        count++;
      }
    }while(fg == true);
    
    System.out.println(count);
  }
}