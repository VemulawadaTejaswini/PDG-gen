import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int hole = 1;
    int count = 0;

    while(hole < b){
      hole = hole + (a-1);
      count += 1;
    }
    System.out.println(count);


  }
}