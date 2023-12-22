import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main{

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = br.readLine().split("\\s"); 
        
        Stack<Integer> st = new Stack<Integer>();
        int a = 0,b=0;
        
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("+")) {
                a = st.pop();
                b = st.pop();
                st.add(b + a);
                continue;
            }
            if (stringArray[i].equals("-")) {
                a = st.pop();
                b = st.pop();
                st.add(b - a);
                continue;
            }
            if (stringArray[i].equals("*")) {
                a = st.pop();
                b = st.pop();
                st.add(b * a);
                continue;
            }
            if (stringArray[i].equals("/")) {
                a = st.pop();
                b = st.pop();
                st.add(b / a);
                continue;
            }
           
            st.push(Integer.parseInt(stringArray[i]));
        }
        System.out.println(st.pop());
    }
}