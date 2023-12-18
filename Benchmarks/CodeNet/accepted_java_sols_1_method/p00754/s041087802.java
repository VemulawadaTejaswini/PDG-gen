import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String line = sc.nextLine();
            if(line.charAt(0) == '.') break;
            
            int flag = 0;
            Deque<Integer> dq = new ArrayDeque<>();
            for(int i = 0; i < 102; i++) {
                char c = line.charAt(i);
                if(c == '.') break;
                else if(c == '(') dq.addLast(1);
                else if(c == '[') dq.addLast(2);
                else if(c == ')') {
                    if(dq.isEmpty() || dq.removeLast() != 1) {
                        flag = 1;
                        break;
                    } 
                }
                else if(c == ']') {
                    if(dq.isEmpty() || dq.removeLast() != 2) {
                        flag = 1;
                        break;
                    }
                }
            }

            if(dq.isEmpty() && flag == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
