import java.util.Scanner;
public class Main {
  public static void main(String args[]){
    Scanner nine = new Scanner(System.in);
    int number1 = nine.nextInt();
    int number2 = nine.nextInt();

    if(1<=number1 && number1<=9 && 1<=number2 && number2<=9){
      int answer = number1*number2;
      System.out.println(answer);
    }else{
      System.out.println("-1");
    }
  }
}
