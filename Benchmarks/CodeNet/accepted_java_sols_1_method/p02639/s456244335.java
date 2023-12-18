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
    
    for(int i=1;i<=5;i++){
      if(sc.nextInt() == 0){
        System.out.println(i);
        return;
      }
    }
  }
}
