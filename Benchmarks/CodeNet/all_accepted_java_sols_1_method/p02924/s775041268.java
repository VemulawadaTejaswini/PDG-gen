import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      long N=in.nextInt();
      long res=N*(N-1)/2;
      System.out.println(res);
      in.close();
    }
}