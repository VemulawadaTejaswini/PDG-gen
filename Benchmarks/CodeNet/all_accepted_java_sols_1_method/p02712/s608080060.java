import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long[] num = new long[a];
    for (int i = 0; i < a; i++) {
      num[i] = i + 1;
    }
    
    long sum = 0;
    for (int i = 0; i < a; i++) {
      if (num[i] % 3 != 0 && num[i] % 5 != 0 && num[i] % 15 != 0) {
        sum += num[i];
      }
    }
    
    System.out.println(sum);
  }
}