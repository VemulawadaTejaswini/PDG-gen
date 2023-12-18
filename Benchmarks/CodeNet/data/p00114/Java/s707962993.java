import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main (String[] args) throws IOException {
    boolean flag = false;
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    int[] m = new int[3];

    while(true){
      for(int i=0; i<3; i++){
        a[i] = sc.nextInt();
        m[i] = sc.nextInt();
      }

      for(int i=0; i<3; i++){
        if(a[i] == 0 && m[i] == 0) flag = true;
        else flag = false;
      }

      if(flag) break;

      System.out.println(counter(a, m));
    }
  }

  private static int counter(int[] a, int[] m){
    int x = 1, y = 1, z = 1, cnt = 0;;
    do{
      cnt++;
      x = a[0] * x % m[0];
      y = a[1] * y % m[1];
      z = a[2] * z % m[2];
    }while(x != 1 || y != 1 || z != 1);

    return cnt;
  }
}