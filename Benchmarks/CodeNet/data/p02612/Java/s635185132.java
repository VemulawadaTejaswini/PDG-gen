import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int total = scan.nextInt();
    if(noguti%1000!=0){
    int noguti = (total/1000)+ 1;
    }else{
    int noguti = (total/1000);
    }
    System.out.print(1000*noguti - total);
  }
}