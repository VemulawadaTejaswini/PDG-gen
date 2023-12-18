import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader t= new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> vector =new Vector<Integer>();
        
        for (int i=1;i<=10;i++){
            vector.add(Integer.parseInt(t.readLine()));
        }
        Collections.sort(vector);
        Collections.reverse(vector);
        for(int i=0;i<3;i++){
            System.out.println(vector.get(i));
        }
    }

}