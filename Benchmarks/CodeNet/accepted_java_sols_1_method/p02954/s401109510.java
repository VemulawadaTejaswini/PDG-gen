import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int n=s.length();
    int a[] = new int[n];
    Arrays.fill(a,0);
    int f=0;
    int b;
    int t;
    boolean flag=true;
    while(flag){
      b=s.indexOf("RL",f);
      t=s.indexOf("LR",b);
      if(t==-1){
        flag=false;
        t=n-1;
      }
      a[b]=a[b]+(b-f+1)/2+(b-f+1)%2+(t-b)/2;
      a[b+1]=a[b+1]+(b-f+1)/2+(t-b)/2+(t-b)%2;
      f=t+1;
    }
    for(int i=0;i<n;i++){
      System.out.println(a[i]);
    }
  }
}