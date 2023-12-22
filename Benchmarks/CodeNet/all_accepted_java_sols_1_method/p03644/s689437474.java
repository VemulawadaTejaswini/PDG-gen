import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt=0,max=0,ans=1;
    for(int i=1;i<=n;i++){
      cnt=0;
      int num=i;
      while(num%2==0){
        cnt++;
        num/=2;
      }
      if(max<cnt){
        ans=i;
        max=cnt;
      }
    }
    System.out.println(ans);
  }
}