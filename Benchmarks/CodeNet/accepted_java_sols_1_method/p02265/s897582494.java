import java.io.*;
import java.util.*;
 
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder out = new StringBuilder();
    static ArrayDeque<Integer> li = new ArrayDeque<Integer>();
 
    public static void main(String[] Args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String in;
        int key;
        for(int i=0; i<n; i++) {
            in = br.readLine();
            if(in.charAt(0) == 'i') {
                key = Integer.parseInt(in.substring(7));
                li.addFirst(key);
            } else if(in.charAt(6) == 'F') {
                li.removeFirst();
            } else if(in.charAt(6) == 'L') {
                li.removeLast();
            } else {
                key = Integer.parseInt(in.substring(7));
                li.remove((Integer) key);
            }
        }
        out.append(li.poll());
        for(int num : li) {
            out.append(' ').append(num);
        }
        out.append('\n');
        System.out.print(out);
    }
 
}