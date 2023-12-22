import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char colorStack[] = new char[1000];
        int stackTop = 0;
        String tmpStr;
        
        while (!(tmpStr = in.readLine()).equals("quit")) {
            String command[] = tmpStr.split(" ");
            
            if (command[0].equals("push")) {
                colorStack[stackTop] = command[1].charAt(0);
                stackTop++;
            } else {
                stackTop--;
                System.out.println(colorStack[stackTop]);
            }
        }
    }
}