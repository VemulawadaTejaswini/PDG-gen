import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.nextLine());
    int B = Integer.parseInt(sc.nextLine());
    int h = Integer.parseInt(sc.nextLine());
    
    System.out.println(((A + B) * h) / 2);
  }
}