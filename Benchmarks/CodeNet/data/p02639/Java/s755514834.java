import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] x = new int[5];
    
    for (int i=0; i<5; i++) {
      x[i] = sc.nextInt();
      if (x[i] == 0) {
        System.out.println(i+1);
        break;
      }
    }
  }
}