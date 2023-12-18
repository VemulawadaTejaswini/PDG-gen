import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int l[] = new int[n+1];
    int d[] = new int[n+1];
    int count = 0;
    for(int i=0 ; i<n ; i++){
      l[i] = sc.nextInt();
    }
    for(int i=0 ; i<n+1 ; i++){
      if(i==0){
        d[0]=0;
      }else{
        d[i] = d[i-1] + l[i-1];
      }
      // System.out.print(d[i]);
      // System.out.println();
    }
    for(int i=0 ; i<n+1 ; i++){
      if(d[i]<=x){
        count++;
      }
    }
    System.out.println(count);
  }
}
