import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	         
          int K = sc.nextInt();
    	  int A = sc.nextInt();
      	  int B = sc.nextInt();
      	  int largest = (B/K)*K;
      if(A <= largest){
        System.out.println("OK");
      }else{
        System.out.println("NG");
      }
    }
}