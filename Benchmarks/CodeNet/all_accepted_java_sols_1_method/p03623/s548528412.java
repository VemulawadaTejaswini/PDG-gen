import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int distToA = Math.abs(x- a); 
    int distToB = Math.abs(x- b); 

    System.out.println(distToA < distToB ? "A" : "B");
  }
}