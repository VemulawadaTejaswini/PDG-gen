import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    long int a = scan.nextInt();
    long int b = scan.nextInt();
    long int c = scan.nextInt();
    long int d = scan.nextInt();
    
    long long[] ans = new long long[4];
    
    ans[0] = a * c;
    ans[1] = a * d;
    ans[2] = b * c;
    ans[3] = b * d;
    long int max = ans[0];
    
    for (int i = 1;i < 4;i ++) {
      if (max < ans[i])
        max = ans[i];
    }
    System.out.println(max);
  }
}
        
