import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int width = Y + 2*Z;
    int people = 1;
    while (width+Y+Z <= X) { 
      width += Y+Z;
      people++;
    }
    System.out.println(people);
  }
}