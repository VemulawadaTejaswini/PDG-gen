import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int all = n*(2*l+n-1)/2;
    int minn = 1<<30;
    int ans = 0;
    for(int i=1;i<=n;i++){
      if(minn>Math.abs(l+i-1)){
        minn = Math.abs(l+i-1);
        ans = all-(l+i-1);
      }
    }
    System.out.println(ans);
  }
}
