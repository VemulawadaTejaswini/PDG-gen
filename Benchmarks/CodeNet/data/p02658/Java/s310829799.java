import java.util.Scanner;
class Main{
	public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
      int N = sr.nextInt();
      long[] A = new long[N];
      long B = 1;
      for(int i=0;i<A.length;i++)
        A [i]=sr.nextLong();
      for(int i=0;i<A.length;i++)
        B *= A[i];
      double result = Math.pow(10, 18);
      if((double)B >= result)
        System.out.println("-1");
      else
        System.out.println(B);
    }
}
