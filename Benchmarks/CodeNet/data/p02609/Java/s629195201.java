import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int[] A=new int[N];
    int M=0;
    for (int i=0;i<N;i++){
      A[i]=sc.nextInt();
      M=M+(int)Math.pow(2*A[i],N-i-1);
    }
    int j=0;
    int popc=Integer.bitCount(M);
    int k=0;
    for (int i=0;i<N;i++) {
      int Mnew=M;
      if (j==i) {
        if (A[i]==0) {
          Mnew=M+(int)Math.pow(2*A[i],N-i-1);
          popc=popc+1;
        }else{
          Mnew=M-(int)Math.pow(2*A[i],N-i-1);
          popc=popc-1;
        }
      }  
      while (Mnew>0) {
        Mnew=Mnew%popc;
        popc=Integer.bitCount(Mnew);
        k=k+1;
      }
      System.out.println(k);
      j=j+1;
      popc=Integer.bitCount(M);
      k=0;
    }
  }
}