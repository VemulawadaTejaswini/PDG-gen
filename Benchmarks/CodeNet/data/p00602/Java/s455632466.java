import java.io.*;
import java.util.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                String[] ia; 

                final int N = 1001;
                ArrayList<Integer> al;
                while((is = in.readLine()) != null){
                        ia = is.split(" ");
                        int V = Integer.parseInt(ia[0]);
                        int d = Integer.parseInt(ia[1]);
                        if(V == 0){
                                System.out.println(0);
                                continue;
                        }
                        int a = 1, b = 1, c;
                        al = new ArrayList<Integer>();
                        for(int i = 0;i < V; ++i){
                                c = a + b;
                                a = b;
                                b = c;
                                al.add(c%N);
                        }   
                        Collections.sort(al);
                        c = 1;
                        a = al.get(0);
                        for(int i = 1;i < al.size(); ++i){
                                b = al.get(i);
                                if((b-a)>=d){
                                        ++c;
                                }
                                a = b;
                        }
                        System.out.println(c);
                }   
        }   
}