import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char last;

        for(;;){
            String s = scan.nextLine();
            if(s.equals(".")) break;

            boolean ans = true;
            Deque<Character> data = new ArrayDeque<Character>();

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') data.addLast('(');
                else if(s.charAt(i) == ')') {
                    if(data.peekLast() == null) {
                        ans = false;
                        break;
                    }
                    if(data.getLast() == '(') {
                        data.removeLast();
                    } else {
                        ans = false;
                        break;
                    }
                }
                else if(s.charAt(i) == '[') data.addLast('[');
                else if(s.charAt(i) == ']') {
                    if(data.peekLast() == null) {
                        ans = false;
                        break;
                    }
                    if(data.getLast() == '[') {
                        data.removeLast();
                    } else {
                        ans = false;
                        break;
                    }
                }
            }
            
            if(data.peekLast() != null) ans = false;

            if(ans) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
