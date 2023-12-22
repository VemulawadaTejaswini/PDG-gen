import java.util.Scanner;
import java.util.Arrays;
 
class Main {
  public static void main(String args[]) {
 
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int p = scan.nextInt();
 
    int count = 0;
 
    while(h > 0){
      count++;
      h = h - p;
    }
    System.out.println(count);
  }
}