import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    int[] array = new int[100001];
    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      array[a]++;
      sum += (long)a;
    }
    int q = sc.nextInt();
    for(int i = 0; i < q; i++){
      int b = sc.nextInt();
      int c = sc.nextInt();
      long diff = (long)(c - b) * (long)array[b];
      array[c] += array[b];
      array[b] = 0;
      sum += diff;
      System.out.println(sum);
    }
  }
}