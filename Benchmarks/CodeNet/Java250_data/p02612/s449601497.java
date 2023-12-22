import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      
      int n = N / 1000;
      if(N % 1000 != 0){
        n++;
      }
      System.out.println(n * 1000 - N);
    
    }
}