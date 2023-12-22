import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char input = sc.nextLine().charAt(0);
    
    if(input >= 'A' && input <= 'Z'){
      System.out.println('A');
    } else {
      System.out.println('a');
    }
  }
}
