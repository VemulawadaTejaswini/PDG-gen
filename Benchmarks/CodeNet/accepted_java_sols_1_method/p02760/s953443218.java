import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[9];
    a[0] = sc.nextInt();
    a[1] = sc.nextInt();
    a[2] = sc.nextInt();
    a[3] = sc.nextInt();
    a[4] = sc.nextInt();
    a[5] = sc.nextInt();
    a[6] = sc.nextInt();
    a[7] = sc.nextInt();
    a[8] = sc.nextInt();
    
    int N = sc.nextInt();
    for(int i=0; i<N; i++) {
      int b = sc.nextInt();
      for(int j=0; j<9; j++) {
        if(a[j] == b) {
          a[j] = 0;
        }
      }
    }
    if(a[0] == 0 && a[1] == 0 && a[2] == 0) {
      System.out.println("Yes");
    } else if(a[0] == 0 && a[1] == 0 && a[2] == 0) {
      System.out.println("Yes");
    } else if(a[3] == 0 && a[4] == 0 && a[5] == 0) {
      System.out.println("Yes");
    } else if(a[6] == 0 && a[7] == 0 && a[8] == 0) {
      System.out.println("Yes");
    } else if(a[0] == 0 && a[3] == 0 && a[6] == 0) {
      System.out.println("Yes");
    } else if(a[1] == 0 && a[4] == 0 && a[7] == 0) {
      System.out.println("Yes");
    } else if(a[2] == 0 && a[5] == 0 && a[8] == 0) {
      System.out.println("Yes");
    } else if(a[0] == 0 && a[4] == 0 && a[8] == 0) {
      System.out.println("Yes");
    } else if(a[2] == 0 && a[4] == 0 && a[6] == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
