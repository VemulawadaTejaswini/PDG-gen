import java.io.*;
import java.util.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                String[] ia; 

                final int N = 1001;
                TreeSet<Integer> ts; 
                while((is = in.readLine()) != null){
                        ia = is.split(" ");
                        int V = Integer.parseInt(ia[0]);
                        int d = Integer.parseInt(ia[1]);
                        int a = 1, b = 1, c;
                        ts = new TreeSet<Integer>();
                        for(int i = 0;i < V; ++i){
                                c = a + b;
                                a = b;
                                b = c;
                                ts.add(c%N);
                        }   
                        Iterator<Integer> it = ts.iterator();
                        a = it.next();
                        c = 1;
                        while(it.hasNext()){
                                b = it.next();
                                if((b-a)>=d){
                                        ++c;
                                }   
                                a = b;
                        }   
                        System.out.println(c);
                }   
        }   
}