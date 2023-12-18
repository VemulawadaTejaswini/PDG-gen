import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long A =sc.nextLong();
      long B =sc.nextLong();
      long K =sc.nextLong();
      
      if(A==K){
      System.out.println((A-K)+" "+" "+B);
      }
      else if(A>K){
      System.out.println((A-K)+" "+" "+B);
      }
      else if(A<K && B>=(K-A)){
       System.out.println(0+" "+" "+(B-(K-A)));
      }
      else if(A<K && B<=(K-A)){
       System.out.println(0+" "+" "+0);
      }
    }
}