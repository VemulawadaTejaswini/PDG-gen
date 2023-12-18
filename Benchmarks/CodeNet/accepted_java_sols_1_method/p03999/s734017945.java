import java.util.*;

class Main{
  static String s;
  static int n;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    s=sc.next();
    n=s.length();
    long ans=0;
    for(int i=1<<(n-1);i<2<<(n-1);i++){
      long ku=0;
      for(int j=0;j<n;j++){
        ku*=10;
        ku+=s.charAt(j)-'0';
        if((i>>j&1)==1){
          ans+=ku;
          ku=0;
        }
      }
    }
    System.out.println(ans);
  }
}