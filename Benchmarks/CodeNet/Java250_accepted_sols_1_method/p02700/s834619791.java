import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int hp1 = sc.nextInt();
          int attack1 = sc.nextInt();
          int hp2 = sc.nextInt();
          int attack2 = sc.nextInt();
          while(hp1 > 0 && hp2 > 0){
            hp2 -= attack1;
          if(hp2 <= 0) {
            System.out.println("Yes");
            continue;
          }
            hp1 -= attack2;
          if(hp1 <= 0) {
            System.out.println("No");
            continue;
          }
          }
          }
        }