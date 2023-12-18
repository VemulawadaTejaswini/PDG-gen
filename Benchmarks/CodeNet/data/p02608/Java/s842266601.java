import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    for(int i=1;i<=N;i++){
      if(i<4){System.out.println(0);}
      else{
      double I =(double)i;
      double T =Math.sqrt(2*I-8);
      int t =(int)T;
       long ans =0;
        for(int j=2;j<=t;j++){
        for(int k=2;k<=t;k++){
          for(int l=2;l<=t;l++){
            if(j+1<=k+l){
              if(k+1<=j+l){
                if(l+1<=j+k){
            if(j*j+k*k+l*l==2*i){
              ans =ans+1;
              }}}}}}}
        System.out.println(ans);
      }
    }
  }
}