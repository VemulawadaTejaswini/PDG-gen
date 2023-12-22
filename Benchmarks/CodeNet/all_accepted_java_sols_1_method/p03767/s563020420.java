import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = 3*n;
    long[] strong = new long[num];
    long sum = 0;
    for (int i = 0; i < num; i++){
      strong[i] = sc.nextLong();
    }
    Arrays.sort(strong);
    for(int j = 0; j < n;j++){
      sum += strong[num-2*(1+j)];
    }
    System.out.println(sum);
  }
}