import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
  
public class Main {
	private MyIntStack st = new MyIntStack();

    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
    
    public void exec() throws IOException {
    	SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        out.println(calc(in.readStrArray(" ")));
        out.flush();
    }

    private int calc(String[] exp) {
    	int ret=0;
    	for(String s: exp) {
    		switch(s.charAt(0)){
	    		case '+':{
	    			int b = st.pop();
	    			int a = st.pop();
	    			ret = st.push(a + b);
	    			break;
	    		}
	    		case '-':{
	    			int b = st.pop();
	    			int a = st.pop();
	    			ret = st.push(a - b);
	    			break;
	    		}
	    		case '*':{
	    			int b = st.pop();
	    			int a = st.pop();
	    			ret = st.push(a * b);
	    			break;
	    		}
	    		default:{
	    			st.push(Integer.parseInt(s));
	    		}
    		}
    	}
    	return ret;
    }

}

class MyIntStack {
	private static final int CAPACITY = 100;
	private int[] stack = new int[CAPACITY];
    private int head = 0;
    
    public boolean isEmpty(){return head == 0;}
    public boolean isFull(){return head == CAPACITY;}
    
    public int pop() {
    	if(isEmpty()) throw new IllegalStateException();
    	return stack[--head];
    }
   
    public int push(int value) {
    	if(isFull()) throw new IllegalStateException();
    	return stack[head++] = value;
    }
}

class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
}