import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        while(!s.equals(".")){
            Deque<Character> stack = new ArrayDeque<Character>();

            boolean flag = true;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '(' || c == '['){
                    stack.push(c);
                }
                else if (c == ')' || c == ']'){
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    char d = stack.pop();
                    if((d == '(' && c == ']') || (d == '[' && c == ')')){
                        flag = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) flag = false;

            if(flag)
                System.out.println("yes");
            else
                System.out.println("no");

            s = scanner.nextLine();
        }

    }
}

