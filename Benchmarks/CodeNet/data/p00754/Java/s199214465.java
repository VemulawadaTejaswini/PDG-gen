import java.util.Scanner;
import java.util.Stack;


class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String str = sc.nextLine();

            if(str.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<Character>();
            boolean f = true;
            char tmp_c;
            char[] ary = str.toCharArray();
            for(char c: ary) {
                if(c == '(' || c == '['){
                    stack.push(c);
                }
                else if(c == ')') {
                    if(stack.empty()) {
                        f = false;
                        break;
                    }
                    tmp_c = stack.pop();
                    if(tmp_c != '('){
                        f = false;
                        break;
                    }
                }
                else if(c ==']'){
                    if(stack.empty()) {
                        f = false;
                        break;
                    }
                    tmp_c = stack.pop();
                    if(tmp_c != '[') {
                        f = false;
                        break;
                    }
                }
            }

            String result;
            if(stack.empty() && f) {
                result = "yes";
            } else {
                result = "no";
            }

            System.out.println(result);
        }
    }
}

