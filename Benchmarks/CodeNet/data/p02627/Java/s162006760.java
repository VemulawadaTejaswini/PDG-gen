

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
      String s= sc.next();

      if(Character.isUpperCase(s.charAt(0))){
          System.out.println('A');
      }
      else
          System.out.println('a');

    }
}
