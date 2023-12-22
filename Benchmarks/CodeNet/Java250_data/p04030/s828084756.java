import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Stack<Character> stack = new Stack<>();
        for(Character c : input.toCharArray()){
            if(c != 'B')
                stack.push(c);
            else{
                if(!stack.empty())
                    stack.pop();
            }
        }
        StringBuilder result = new StringBuilder("");
        while(!stack.empty()){
            result.append(stack.pop());
        }
        result.reverse();
        System.out.println(result.toString());
    }
}
