import java.util.Scanner;
class Main{
	public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
      int N = sr.nextInt();
      int[] A = new int[N];
      int B = 1;
      for(int i=0;i<A.length;i++)
        A [i]=sr.nextInt();
      for(int j:A)
        B *= j;
      System.out.println(B);
    }
}