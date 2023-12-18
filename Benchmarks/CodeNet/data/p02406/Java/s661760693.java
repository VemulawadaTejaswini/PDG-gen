import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    for(int i = 1; i <= a; i++){
      if(i % 3 == 0 || i % 10 == 3 || i / 10 == 3){
        System.out.print(" " + i);
      }
    }
    System.out.println("");
  }
}