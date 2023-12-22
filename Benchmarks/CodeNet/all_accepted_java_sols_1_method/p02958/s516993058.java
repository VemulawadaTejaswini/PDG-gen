import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p[] = new int[n];
    int q[] = new int[n];
    int count = 0;
    for(int i=0 ; i<n ; i++){
      p[i] = sc.nextInt();
    }
    for(int i=0 ; i<n ; i++){
      q[i] = p[i];
    }
    Arrays.sort(q);
    // for(int i=0 ; i<n ; i++){
    //   System.out.print(q[i]);;
    // }
    for(int i=0 ; i<n ; i++){
      if(p[i]!=q[i]){
        count++;
      }
    }
    if(count<=2){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
