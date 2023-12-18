import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] x=new int[m];
    if(n>=m){
      System.out.println(0);
      return;
    }
    int[] s=new int[m-1];
    for(int i=0;i<m;i++){
      x[i]=sc.nextInt();
    }
    Arrays.sort(x);
    for(int i=0;i<m-1;i++){
      s[i]=x[i+1]-x[i];
    }
    Arrays.sort(s);
    int sum=0;
    for(int i=m-2;i>m-2-n+1;i--){
      sum+=s[i];
    }
    System.out.println(x[m-1]-x[0]-sum);
  }
}