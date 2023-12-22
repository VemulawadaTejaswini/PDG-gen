import java.util.*;

public class Main{

	public static void main(String args[]){

      Scanner in =new Scanner (System.in);
      int a,b,k;
      a=in.nextInt();
      b=in.nextInt();
      k=in.nextInt();

      for(int i=a;i<=Math.min(b,a+k-1);i++){
      	System.out.println(i);
      }


      for(int i=Math.max(b-k+1,a+k);i<=b;i++){
        System.out.println(i);}

	}
}