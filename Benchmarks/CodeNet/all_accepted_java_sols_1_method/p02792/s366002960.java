import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] fb=new int[10][10];
    for(int a=1;a<=n;a++){
      int f=a;
      while(f>=10){
        f/=10;
      }
      fb[a%10][f]++;
    }
//    System.err.println(Arrays.deepToString(fb));
    long ans=0;
    for(int a=1;a<=n;a++){
      int f=a;
      while(f>=10){
        f/=10;
      }
      ans=ans+=fb[f][a%10];
    }
    System.out.println(ans);
  }
}