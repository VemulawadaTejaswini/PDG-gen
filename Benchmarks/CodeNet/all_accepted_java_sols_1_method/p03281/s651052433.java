import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    for(int i=1;i<=n;i++){
      if(i%2==0) continue;
      int cnt=0;
      for(int j=i;j>=1;j--){
        if(i%j==0){
          cnt++;
        }
      }
      if(cnt==8){
        c++;
      }
    }
    System.out.println(c);
  }
}