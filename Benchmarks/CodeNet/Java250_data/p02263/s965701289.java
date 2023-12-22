
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    
    public static void main(String[] args) throws IOException {
        Deque<Long> stack = new ArrayDeque<>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        
        String s = buf.readLine();
        String[] splited = s.split(" ", 0);
      
        //????????????????????¨??£?????????.(?¨?????????????second op first)??¨???
        long first;
        long second;
        for (String currentString : splited) {
            if ("+".equals(currentString)) {
                first = stack.removeFirst();
                second = stack.removeFirst();
                stack.addFirst((second + first));
            } else if ("-".equals(currentString)) {
                first = stack.removeFirst();
                second = stack.removeFirst();
                stack.addFirst((second - first));               
            } else if ("*".equals(currentString)) {
                first = stack.removeFirst();
                second = stack.removeFirst();
                stack.addFirst((second * first));            
            } else if ("/".equals(currentString)) {
                first = stack.removeFirst();
                second = stack.removeFirst();
                stack.addFirst((second / first));
            } else {
                stack.addFirst(Long.parseLong(currentString));
            }
        }
        System.out.println(stack.removeFirst());
    }
}