import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();

            if(input.charAt(0) == '.' && input.length() == 1)
                break;

            Deque<String> s = new ArrayDeque<String>();

            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == '(')
                    s.addLast("(");
                if(input.charAt(i) == '[')
                    s.addLast("[");
                if(input.charAt(i) == ')'){
                    if(s.size() == 0) {
                        s.addLast(")");
                        System.out.println("no");
                        break;
                    }
                    if(s.getLast().equals("("))
                        s.removeLast();
                    else {
                        System.out.println("no");
                        break;
                    }
                }
                if(input.charAt(i) == ']'){
                    if(s.size() == 0) {
                        s.addLast("]");
                        System.out.println("no");
                        break;
                    }
                    if(s.getLast().equals("["))
                        s.removeLast();
                    else {
                        System.out.println("no");
                        break;
                    }
                }
            }
            if(s.size() == 0)
                System.out.println("yes");
        }

        sc.close();
    }
}

