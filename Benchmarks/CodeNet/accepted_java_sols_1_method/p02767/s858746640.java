import java.util.*;
class Main{
  static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args){
    
    int N = s.nextInt();
    int[] X = new int[N];
    for(int i=0;i<N;i++) X[i] = s.nextInt();       
    Arrays.sort(X);
    int temp1 = 0;
    int temp2 = 0;

    for(int i=X[0];i<=X[N-1];i++){
      temp1 = 0;
      for(int j=0;j<N;j++){
        temp1 += Math.pow(X[j]-i,2);
      }
      if(i==X[0]) temp2 =temp1;
      else temp2=Math.min(temp1,temp2);
    }
    System.out.println(temp2);
  }
}