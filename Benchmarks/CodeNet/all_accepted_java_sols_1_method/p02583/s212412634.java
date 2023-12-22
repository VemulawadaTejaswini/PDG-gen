import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    if(N<3){System.out.println(0);}
    else{
      long L[] =new long[N];
      for(int i=0;i<N;i++){
        L[i] =sc.nextLong();}
      Arrays.sort(L);
      long ans =0;
      for(int j=0;j<N-2;j++){
        for(int k=j+1;k<N-1;k++){
          for(int l=k+1;l<N;l++){
            if(L[j]!=L[k]){
              if(L[k]!=L[l]){
                if(L[j]+L[k]>L[l]){
                  ans =ans +1;}
              }
            }
          }
        }
      }
      System.out.println(ans);
    }
  }
}