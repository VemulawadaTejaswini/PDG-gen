import java.util.*;
public class Main {
  	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int a[] = new int[N];
      a[0] = sc.nextInt();
      int num = 1000;
      for (int count = 1; count < N; count++){
  	    a[count] = sc.nextInt();
        if(a[count-1] < a[count]){
          int s = num / a[count-1];
          num = num % a[count-1] + s * a[count];
        }
      }
      System.out.println(num);
    }
}