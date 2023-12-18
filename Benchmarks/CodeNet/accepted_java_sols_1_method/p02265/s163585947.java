import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
    public static void main(String[] args) throws IOException{
        final PrintWriter out = new PrintWriter(System.out);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final Deque<Integer> list = new ArrayDeque<Integer>(1000000);
        final int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            final String in = br.readLine();
            if(in.charAt(0)=='i'){
                list.offerFirst(Integer.valueOf(in.substring(7)));
            }else if(in.charAt(6)=='F'){
                list.removeFirst();
            }else if(in.charAt(6)=='L'){
                list.removeLast();
            }else{
                list.remove(Integer.valueOf(in.substring(7)));
            }
        }
        out.print(list.poll());
        for(final Integer e:list){
            out.print(' ');
            out.print(e);
        }
        out.println();
        out.flush();
    }
}