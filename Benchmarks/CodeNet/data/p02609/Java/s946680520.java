import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    sc.nextLine();
    String bits = sc.nextLine();
    int x10 = 0;
    int oneCnt = 0;
    int[] cnts = new int[n];

    for(int i = n - 1; i >= 0; i--){
      if(bits.charAt(i) == '1'){
      	x10 += Math.pow(2, n - 1 - i);
      }
    }
    
    for(int i = 0; i < n; i++){
      int c;
      c = (bits.charAt(i) == '0') ? (int)Math.pow(2, n - 1 - i) : (int)Math.pow(2, n - 1 - i) * -1;
      cnts[i] = f(x10 + c, 1);
    }
    
    for(int i = 0; i < n; i++){
      System.out.println(cnts[i]);
    }
    
  }
  
  static int f(int x, int ans){
    int two = 1;
    for(; two <= x; two *= 2){}
    two /= 2;
    int cnt = 0;
    int wx = x;
    for(; two > 0; two /= 2){
      if(wx / two > 0){cnt++;}
      wx %= two;
    }
    
    int next = x % cnt;
    return (next == 0) ? ans : f(next, ans + 1);
  }
}