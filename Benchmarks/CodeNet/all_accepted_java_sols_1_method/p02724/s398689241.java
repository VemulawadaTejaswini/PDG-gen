import java.util.*;
 
public class Main {
  	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int money = sc.nextInt();
      int happy = (money/500)*1000 + ((money%500)/5)*5;

      System.out.println(happy);
    }
}