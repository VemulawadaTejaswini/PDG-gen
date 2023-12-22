import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] p = new long[n];
    for(int i = 0;i<n;i++){
      p[i] = sc.nextLong();
    }
    int count = 0;
    for(int i=1;i<n-1;i++){
      if(p[i-1]<p[i]&&p[i]<p[i+1]||p[i-1]>p[i]&&p[i]>p[i+1])count++;
    }
    System.out.println(count);
  }
}
