import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] l = new int[n];
    for(int i=0; i<n; ++i)
      l[i] = sc.nextInt();
    int ans = 1;
    int area = 0;
    for(int i=0; i<n; ++i){
      area += l[i];
      if( area <= x )
        ++ans;
      else
        break;
    }
    System.out.println(ans);
  }
}