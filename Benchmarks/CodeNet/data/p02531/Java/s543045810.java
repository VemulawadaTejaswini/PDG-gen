import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.ArrayList;
public class Main {
    Stack<String> st = new Stack<String>();
    ArrayList<String> al = new ArrayList<String>();
        
    public void Main() {
    }
    
    public void go() {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String line = stdReader.readLine();
                if (line.indexOf("quit") >= 0) {
                    break;
                } else if (line.indexOf("push") >= 0) {
                    String[] buf = line.split(" ");
                    st.push(buf[1]);
                } else if (line.indexOf("pop") >= 0) {
                    al.add(st.pop());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(-1);
        }
    }

    public void printOut() {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        m.go();
        m.printOut();
    }
}