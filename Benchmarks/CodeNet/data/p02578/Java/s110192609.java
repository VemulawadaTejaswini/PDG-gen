import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a;
    int b=sc.nextInt();
    int ans=0;
    for(int i=0;i<n;i++){
      a=sc.nextInt();
        if(a<b){
          ans+=b-a;
          a=b;
        }
      else b=a;
    }
    System.out.println(ans);
  }
}
  