import java.util.Scanner;
  public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int Max = 0;
      int sum1 = 0;
      int sum2 = 0;
      int[] X = new int[N];

      for(int i=0;i<N;i++){
        X[i] = sc.nextInt();
        if(Max<X[i]){
          Max=X[i];
        }
      }
      sc.close();
      sum1 = pow(1,N,X);
      for(int j=2;j<=Max;j++){
          sum2 = pow(j,N,X);
          if(sum1>sum2){
            sum1=sum2;
          }
      }
      System.out.println(sum1);
    }
    private static int pow(int n1,int N,int array[]){
      int sum = 0;
      for(int k=0;k<N;k++){
        sum+=Math.pow(array[k]-n1,2);
      }
      return sum;
    }
  }