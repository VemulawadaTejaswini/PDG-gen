import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();


      int[] remainder = new int[4];
      for(int i = 0; i < n; i++)
        remainder[sc.nextInt() % 4]++;

      int cnt = remainder[0] + remainder[2] / 2;
      if(cnt >= n / 2)
        System.out.println("Yes");
      else
        System.out.println("No");
  }
}
