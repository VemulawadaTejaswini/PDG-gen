import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final Deque<Integer> st = new ArrayDeque<Integer>(128);
        final String[] in = br.readLine().split(" ");
        for(int i = 0; i<in.length; i++){
            if(in[i].equals("+")){
                final int b = st.poll();
                final int a = st.poll();
                st.addFirst(a+b);
            }else if(in[i].equals("-")){
                final int b = st.poll();
                final int a = st.poll();
                st.addFirst(a-b);
            }else if(in[i].equals("*")){
                final int b = st.poll();
                final int a = st.poll();
                st.addFirst(a*b);
            }else{
                st.addFirst(Integer.valueOf(in[i]));
            }
        }
        System.out.println(st.peek());
    }
}