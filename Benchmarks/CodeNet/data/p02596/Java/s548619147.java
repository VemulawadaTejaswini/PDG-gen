import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    System.out.println(solve(k));
  }
  static int solve(int k){
    if(k % 2 == 0 || k % 5 == 0){
      return -1;
    }
    int num = 7;
    int count = 1;
    while(count <= k){
      int r = num % k;
      if(r == 0){
        return count;
      } else {
        num = (r * 10) + 7;
        count++;
      }
    }
    return -1;
  }
}
