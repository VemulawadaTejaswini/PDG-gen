/*
 * Click `Run` to execute the snippet below!
 */
 
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int total = 0;
    total += 700;
    for(int i = 0; i<3; i++){
      if(s.charAt(i) == 'o'){
        total += 100; 
      }
    }
    System.out.println(total);
  }
}
