import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=s.length()+1;
    long[] d=new long[n];
    long[] p=new long[n];
    d[0]=0;
    p[n-1]=0;
    for(int i=1;i<n;i++){
      if(s.charAt(i-1)=='<'){
        d[i]=d[i-1]+1;
      }else{
        d[i]=0;
      }
    }
    for(int i=n-2;i>=0;i--){
      if(s.charAt(i)=='>'){
        p[i]=p[i+1]+1;
      }else{
        p[i]=0;
      }
    }
    long sum=0;
    for(int i=0;i<n;i++){
      sum+=Math.max(d[i],p[i]);
    }
    System.out.println(sum);
  }
}