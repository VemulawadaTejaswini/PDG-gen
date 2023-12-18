import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      int n,y,mb=0;
      double max=0;
      n=sc.nextInt();
      if(n==0)break;
      y=sc.nextInt();
      for(int i=0,b,r,t=0;i<n;++i){
        b=sc.nextInt();r=sc.nextInt();t=sc.nextInt();
        double rt=(t==1)?1+y*r/100.0:Math.pow(1+r/100.0,y);
        if(rt>max){
          max=rt;
          mb=b;
        }
      }
      System.out.println(mb);
    }
  }
}