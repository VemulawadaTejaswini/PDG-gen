import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                String[] ia; 

                while((is = in.readLine()) != null){
                        int n = Integer.parseInt(is);
                        ia = in.readLine().split(" ");
                        ArrayList<Integer> al = new ArrayList<Integer>();
                        for(int i = 0;i < n; ++i){
                                al.add(Integer.parseInt(ia[i]));
                        }   
                        Collections.sort(al);
                        int p = 0;
                        int t = 0;
                        for(int i = 0;i < n; ++i){
                                p += al.get(i);
                                t += p;
                        }   
                        System.out.println(t);
                }   
        }   
}