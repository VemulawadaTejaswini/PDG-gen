import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 1;
    char[] ca = sc.next().toCharArray();
    for (int i = 0; i < n - 1; i++)
      if (ca[i] != ca[i + 1])
        count++;
    System.out.println(count);
  }
}
