import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int total = scan.nextInt();
    int noguti = 0;
    if(total < 1000){
     System.out.print(1000- total);
    }
    if(total > 999 && total % 1000 == 0){
     System.out.print(0);
    }
    if(total > 999 && total % 1000 != 0){
     noguti = (total/1000)+ 1;
    System.out.print(1000*noguti - total);
    }    
  }
}