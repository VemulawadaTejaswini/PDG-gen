import java.util.*;
class Main{
    public static void main(String[] a){
      int n = 10;
      int[] num = new int[n];

      Scanner stdin = new Scanner(System.in);
      for ( int i = 0; i < n; i++ ){
        num[i] = stdin.nextInt();
      }

      boolean flag = true;
      while (flag){
        flag = false;
        for ( int j = n-1; j >= 1; j-- ){
          if ( num[j] > num[j-1] ){
            int tmp = num[j];
            num[j] = num[j-1];
            num[j-1] = tmp;
            flag = true;
          }
        }
      }

      for ( int i = 0; i < 3; i++ ){
        System.out.println(num[i]);
      }
    }
}