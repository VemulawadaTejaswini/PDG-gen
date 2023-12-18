import java.util.*;
  public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String[] a={" ","AC","WA","TLE","RE"};
    String[] S=new String[N+1];
    int[] C={0,0,0,0};
    for(int x=1;x<=N;x++) S[x]=sc.next();
    for(int c=1;c<=N;c++){
      for(int i=1;i<=4;i++){
        if(S[c].equals(a[i])) C[i-1]++;
      }
    }
    for(int z=1;z<=4;z++) System.out.printf("%s × %d\n",a[z],C[z-1]);
  }
}  