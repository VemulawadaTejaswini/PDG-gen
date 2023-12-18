import java.util.Scanner;
import java.util.*;

class Main{
  public static void main(String args[]){
    	
    Scanner in = new Scanner(System.in);
    Stack<Integer> stack = new Stack<Integer>();

    while(in.hasNextInt()){
      final int input = in.nextInt();
      
      if(input != 0){
        stack.push(input);
      }else{
        System.out.println(stack.pop());
      }
    }

  }
}