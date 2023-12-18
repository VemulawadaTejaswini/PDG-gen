import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int m = Integer.parseInt(sc.next());
      int f = Integer.parseInt(sc.next());
      int r = Integer.parseInt(sc.next());
      if(m == -1 && f == -1 && r == -1){
        break;
      }
      else{
        if(m == -1 || f == -1){
          System.out.println("F");
          continue;
        }
        else if((m + f) >= 80){
          System.out.println("A");
          continue;
        }
        else if((m + f) >= 65){
          System.out.println("B");
          continue;
        }
        else if((m + f) >= 50){
          System.out.println("C");
          continue;
        }
        else if((m + f) >= 30){
          if(r >= 50){
            System.out.println("C");
            continue;
          }
          else{
            System.out.println("D");
            continue;
          }
        }
        else{
          System.out.println("F");
          continue;
        }
      }
    }
  }
}
