import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a;
    int ans=0;
    for(int i=0;i<n;i++){
      a=sc.nextInt();
      while(a%2==0){
        a/=2;
        ans++;
      }
    }
    System.out.println(ans);
  }
}