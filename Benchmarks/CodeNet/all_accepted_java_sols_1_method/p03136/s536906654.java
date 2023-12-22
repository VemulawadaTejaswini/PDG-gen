import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int l = in.nextInt();
      sum += l;
      if(l > max){
        max = l;
      }
    }// End loop

    System.out.println(max < sum - max ? "Yes" : "No");

  }
}