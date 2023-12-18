import java.util.*;

class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int number1 = sc.nextInt();
  int number2 = sc.nextInt();
  int menseki = number1 * number2;
  int shuu = number1 * 2 + number2 * 2;
  System.out.println(menseki + " " + shuu);
 }
}
