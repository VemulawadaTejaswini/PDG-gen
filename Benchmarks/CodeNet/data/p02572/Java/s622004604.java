import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    for(int k = 0;k<N;k++){
      A[k]=(long)sc.nextInt();
    }
    long re = 0;
    for(int i = 0;i<N;i++){
      for(int j = i+1;j<N;j++){
        re+=(A[i]*A[j])%1000000007;
        if(re>=1000000007){
          re = re%1000000007;
        }
      }
    }
    System.out.println(re);
  }
}