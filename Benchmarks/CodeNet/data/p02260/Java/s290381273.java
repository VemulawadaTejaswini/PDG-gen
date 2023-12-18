import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int n = 0;
        int[] A = Arrays.stream(getContents().get(1).split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0, len = A.length; i < len; ++i){
            int j = minIndex(A, i);
            if(A[i] != A[j]){
                int v = A[i];
                A[i] = A[j];
                A[j] = v;
                ++n;
            }
        }
        System.out.println(String.join(" ", Arrays.stream(A).mapToObj(String::valueOf).toArray(String[]::new)));
        System.out.println(String.valueOf(n));
    }
    
    public static ArrayList<String> getContents() throws IOException{
        String line;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine()) != null) list.add(line);
        
        return list;
    }
    
    public static int minIndex(int[] A, int i){
        int j = i;
        for(int len = A.length; i < len; ++i)
            if(A[i] < A[j]) j = i;
        return j;
    }
}
