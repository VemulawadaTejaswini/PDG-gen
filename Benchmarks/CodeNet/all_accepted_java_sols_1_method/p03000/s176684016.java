import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] l = new int[n];
    for(int i = 0;i<n;i++){
      l[i] = sc.nextInt();
    }
    int count = 1;
    int now = 0;
    for(int i = 0;i<n;i++){
      now+=l[i];
      if(now>x)break;
      count++;

    }
    System.out.println(count);
  }
}
