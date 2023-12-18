import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] p = new int[n];
    for(int i = 0;i<n;i++){
      p[i] = Math.abs(sc.nextInt()-x);
    }
    Arrays.sort(p);
    int d=0;
    distance:for(int i = p[0];i>0;i--){
      for(int j = 0;j<n;j++){
        if(p[j]%i!=0)continue distance;
        if(j==n-1){
          d = i;
          break distance;
        }
      }
    }
    System.out.println(d);

  }
}
