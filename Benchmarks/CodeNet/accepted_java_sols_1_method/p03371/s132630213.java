import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int ans = Integer.MAX_VALUE;
    for(int i=0; i<=100000; i++){
      int temp = 2*C*i + A*Math.max(0,X-i) + B*Math.max(0, Y-i);
      ans = Math.min(ans, temp);
    }
    System.out.println(ans);
  }
}
