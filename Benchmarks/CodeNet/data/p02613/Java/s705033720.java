import java.util.*;
  public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String[] a={"AC","WA","TLE","RE"};
    String[] S=new String[N];
    int[] cnt={0,0,0,0};
    for(int x=0;x<N;x++) S[x]=sc.next();
    for(int c=0;c<N;c++){
      for(int i=0;i<4;i++){
        if(S[c].equals(a[i])) cnt[i]++;
      }
    }
    for(int z=0;z<4;z++) System.out.printf("%s × %d\n",a[z],cnt[z]);
  }
}  