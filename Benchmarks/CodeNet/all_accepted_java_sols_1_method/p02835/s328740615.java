import java.util.*;
public class Main{
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          int x = scanner.nextInt();
          int y = scanner.nextInt();
          int z = scanner.nextInt();
          int res = x+y+z;
          if(res >= 22){
            System.out.println("bust");
          }
          else{
            System.out.println("win");
          }
     }
}