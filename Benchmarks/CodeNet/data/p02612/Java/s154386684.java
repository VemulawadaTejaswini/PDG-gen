import java.util.Scanner;

public class main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int total = scan.nextInt();
    int noguti = total/1000 + 1;
    System.out.println(1000*noguti - total);
  }
}