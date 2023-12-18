import java.util.Scanner;
class Main{
	public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
      int A = sr.nextInt();
      int B = sr.nextInt();
      int C = sr.nextInt();
      int K = sr.nextInt();
      //System.out.print(A +""+ B +""+C+ ""+K );
      if ( K <= A)
        System.out.print(K);
      else
        if(K <= A+B)
          System.out.print(A);
        else
          System.out.print(2*A+B-K); 
    }
}