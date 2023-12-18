import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long[] arrays = new long[n];
    for (int i = 0; i < n; i++) {
        arrays[i] = sc.nextLong();
    }
    
    long sum = 1;
    for (long i : arrays) {
        sum *= i;
    }
    
    if (sum >= Math.pow(10, 18) + 1) {
        System.out.println(-1);
    } else {
        System.out.println(sum);
    }
     
      }
}