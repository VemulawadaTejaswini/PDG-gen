import java.util.Scanner;

public class Main{
  public static int n;
  public static int s;
  public static int count;
  public static int[] a = new int[10];

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    while(true){
      n = scanner.nextInt();
      s = scanner.nextInt();
      count = 0;
      if(n == 0 && s == 0){break;}
      for (int i = 0; i < 10; i++)
        a[i] = i;

        dfs(0, 0, 0);
        System.out.println(count);
    }
  }
