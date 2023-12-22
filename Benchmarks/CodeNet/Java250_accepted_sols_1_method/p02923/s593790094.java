import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long H[] =new long[N];
    H[0]=sc.nextLong();
    int t=0;
    int ans =0;
    for(int i=1;i<N;i++){
      H[i]=sc.nextLong();
      if(H[i-1]>=H[i]){t=t+1;}
      else{t=0;}
      ans =Math.max(ans,t);}
    System.out.println(ans);
  }
}