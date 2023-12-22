import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner =  new Scanner(System.in);
    int N = scanner.nextInt();
    if(N % 2 != 0){
      N++;
    }
    System.out.println(N / 2);
  }
}