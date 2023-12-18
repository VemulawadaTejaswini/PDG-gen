import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    
    int[] ans = new int[4];
    
    ans[0] = a * c;
    ans[1] = a * d;
    ans[2] = b * c;
    ans[3] = b * d;
    int max = ans[0];
    
    for (int i = 1;i < 4;i ++) {
      if (max < ans[i])
        max = ans[i];
    }
    System.out.println(max);
  }
}
        