import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      
      int B1 =(B/K)*K;
      
      if(A<=B1){
        System.out.println("OK");
      }
      else{
        System.out.println("NG");
      }
    }
}