import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    for(int i=1;i<=N;i++){
      if(i<4){System.out.println(0);}
      else{
      double I =(double)i;
      double T=Math.sqrt(2*I-8);
      double D=Math.sqrt(2*I/3);
      int t =(int)T;
        int d =(int)D;
       long ans =0;
        for(int j=2;j<=d;j++){
        for(int k=j;k<=t;k++){
          int m =Math.max(d,k);
          for(int l=m;l<=t;l++){
            if(j+1<=k+l){
              if(k+1<=j+l){
                if(l+1<=j+k){
            if(j*j+k*k+l*l==2*i){
              ans =ans+3;
              if((j==k)&&(k==l)){ans =ans-2;}
              }}}}}}}
        System.out.println(ans);
      }
    }
  }
}
