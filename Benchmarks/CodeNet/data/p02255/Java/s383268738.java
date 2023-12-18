import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        String line = getContents().get(1);
        System.out.println(line);
        int[] xs = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        int v;
        for(int i = 1, len = xs.length; i < len; ++i){
            v = xs[i];
            int j = i - 1;
            while(j >= 0 && xs[j] > v){
                xs[j + 1] = xs[j];
                --j;
            }
            xs[j + 1] = v;
            System.out.println(String.join(" ", Arrays.stream(xs).mapToObj(String::valueOf).toArray(String[]::new)));
        }
    }
    
    public static ArrayList<String> getContents() throws IOException{
        String line;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine()) != null) list.add(line);
        
        return list;
    }
}
