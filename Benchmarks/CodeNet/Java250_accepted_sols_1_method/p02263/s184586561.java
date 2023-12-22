import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] input = in.nextLine().split(" ");
    in.close();

    int result = 0;
    
    Stack<Integer> numbers = new Stack<Integer>();
    
    for (int i = 0; i < input.length; i++) {
      try {
        numbers.push(Integer.parseInt(input[i]));
      } catch(Exception e) {
        //pop last two from stack and compute
        int second = numbers.pop();
        int first = numbers.pop();
        
        // evaluate based on operator
        if (input[i].equals("+")) {
          result = first + second;
        } else if (input[i].equals("-")) {
          result = first - second;
        } else {
          result = first * second;
        }
        numbers.push(result);
      }
    }
    // print results
    System.out.println(result);
  }
}
