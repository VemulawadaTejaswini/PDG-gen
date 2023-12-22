import java.util.Scanner;

public class Main{
  static String str;
  static int N,zeroC,oneC;
  static int[] A;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    str = sc.next();
    N = str.length();
    A = new int[N];
    for(int i=0;i<N;i++){
      A[i]=Character.getNumericValue(str.charAt(i));
      if(A[i]==0){
        zeroC++;
      }
      else{
        oneC++;
      }
    }
    System.out.println(N-(Math.abs(zeroC-oneC)));



  }


}
