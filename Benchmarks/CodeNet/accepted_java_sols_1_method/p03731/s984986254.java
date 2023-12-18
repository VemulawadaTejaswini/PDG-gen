import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long T =sc.nextLong();
    long t[] =new long[N];
    t[0]=sc.nextLong();
    long S =t[0];
    long M =t[0]+T;
    long ans =0;
    if(N==1){ans =ans+T;}
    for(int i=1;i<N;i++){
      t[i]=sc.nextLong();
      if(t[i]<M){
        M=t[i]+T;}
      else{ans =ans+M-S;
           M=t[i]+T;
           S=t[i];}
      if(i==N-1){ans =ans +M-S;}}
    System.out.println(ans);
  }
}