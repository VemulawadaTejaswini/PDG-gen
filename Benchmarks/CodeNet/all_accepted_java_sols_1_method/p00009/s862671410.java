import java.util.Scanner;
class Main{
  public static void main(String[] args){
    final int N=1000000;
    boolean[] p=new boolean[N+1];
    p[0]=p[1]=true;
    for(int i=2;i<=Math.sqrt(N);++i){
      if(p[i]) continue;
      for(int j=i*i;j<=N;j+=i) p[j]=true;
    }
    int[] s=new int[N+1];
    for(int i=2;i<=N;++i) s[i]=s[i-1]+((p[i])?0:1);
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt();
      System.out.println(s[n]);
    }
  }
}