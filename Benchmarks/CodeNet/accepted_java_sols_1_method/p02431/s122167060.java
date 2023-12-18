import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {
        Vector<Integer> vec=new Vector<>();
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            if(a==2)vec.remove(vec.size()-1);
            else{
                int b=Integer.parseInt(st.nextToken());
                if(a==0)vec.add(b);
                else out.println(vec.get(b));
            }
        }
        out.flush();
    }
}
