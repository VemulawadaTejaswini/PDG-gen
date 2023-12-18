import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int [] data = new int[n];
      int count = 0;

      for (int i = 0;i<n ;i++ ) {
        data[i] = sc.nextInt();
      }

      for (int i = 1;i<n-1 ;i++ ) {
        if ((data[i-1]<data[i]&&data[i]<data[i+1])||(data[i-1]>data[i]&&data[i]>data[i+1])) {
          count++;
        }
      }

        System.out.println(count);



  }
}
