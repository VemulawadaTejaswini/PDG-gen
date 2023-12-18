import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
   
public class Main {
    LinkedList<Integer> list = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
     
    public void exec() throws IOException {
        SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.readInt();
         
        for(int i=0; i<n; i++) {
            String[] cmd = in.br.readLine().split(" ");
            if(cmd[0].equals("insert")){
                list.addFirst(new Integer(cmd[1]));
            } else if(cmd[0].equals("delete")){
                list.remove(new Integer(cmd[1]));
            } else if(cmd[0].equals("deleteFirst")){
                list.removeFirst();
            } else {
                list.removeLast();
            }
        }
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            if(first) {
                first = false;
            } else {
                sb.append(" ");
            }
            sb.append(i);
        }
        out.println(sb.toString());
        out.flush();
    }
}
 
class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
        return br.readLine().split(delim);
    }
     
    public int readInt() throws NumberFormatException, IOException{
        return Integer.parseInt(br.readLine());
    }
     
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
                if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
                }
            }
        }
        return a;
    }
 
     
}