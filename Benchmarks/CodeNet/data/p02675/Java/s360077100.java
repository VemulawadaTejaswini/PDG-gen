import java.util.Scanner;
public class Main{
  public static void main(String args[]){
      Scanner guess = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = guess.nextInt(); 
      String number = String.valueOf(n);
      if(number.charAt(1) == 2 || number.charAt(1) == 4 || number.charAt(1)== 5 || number.charAt(1) == 7 || number.charAt(1) == 9){
          System.out.println("hon");
        }
        else if(number.charAt(1) == 0 || number.charAt(1) == 1 || number.charAt(1) == 6 || number.charAt(1) == 8){
            System.out.println("pon");
        }
      else{
          System.out.println("bon");
        }
      
}
}
