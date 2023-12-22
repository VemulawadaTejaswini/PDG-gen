import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Set<Integer> d = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            d.add(Integer.valueOf(br.readLine()));
        }
        
        out.println(d.size());
        out.close();
        
    }
}