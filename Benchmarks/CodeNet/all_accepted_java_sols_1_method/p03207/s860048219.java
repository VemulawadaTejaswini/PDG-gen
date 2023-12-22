import java.util.Scanner;

public class Main{
	public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int totalPrice = 0;
      int maxPrice = 0;
      
      for(int i = 0 ; i < n ; i++){
      	int value = sc.nextInt();
        totalPrice += value;
        maxPrice = Math.max(maxPrice,value);
      }
      
      totalPrice -= maxPrice/2;
      
      System.out.print(totalPrice);
    }
}