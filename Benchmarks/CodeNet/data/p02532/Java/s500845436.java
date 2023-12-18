import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;


@SuppressWarnings({"unchecked"})
class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int numStack = Integer.parseInt(in.readLine());
        Deque<String> stack[];
        stack = (ArrayDeque<String>[]) new ArrayDeque[numStack];
        for (int i=0; i<numStack; i++) {
            stack[i] = new ArrayDeque<String>();
        }
        String tmpStr;
        
        while (!(tmpStr = in.readLine()).equals("quit")) {
            String command[] = tmpStr.split(" ");
            
            if (command[0].equals("push")) {
                int arg1 = Integer.parseInt(command[1]);
                stack[arg1-1].addFirst(command[2]);
                
            } else if (command[0].equals("pop")) {
                int arg1 = Integer.parseInt(command[1]);
                System.out.println(stack[arg1-1].removeFirst());
                
            } else {
                int arg1 = Integer.parseInt(command[1]);
                int arg2 = Integer.parseInt(command[2]);
                stack[arg2-1].addFirst(stack[arg1-1].removeFirst());
                
            }
        }
    }
}