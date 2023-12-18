import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = Math.max(n,m);
    int y = Math.min(n,m);
    for(int i=1;i<=x;i++){
      sb.append(y);
    }
    System.out.println(sb);
  }
}