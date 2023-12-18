import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int j=0;
    int[] A=new int[N];
    for (int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    for (int i=0;i<N;i++){
      if (i%2==0) {
        if (A[i]%2==1) {
          j=j+1;
        }  
      }  
    }
    System.out.println(j);
  }
}