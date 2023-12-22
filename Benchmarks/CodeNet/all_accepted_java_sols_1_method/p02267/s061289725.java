import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] s = br.readLine().split(" ");
        br.readLine();
        String[] t = br.readLine().split(" ");
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for(String k : s) map.put(k, true);
        
        System.out.println(Arrays.stream(t).filter(x -> map.containsKey(x)).count());
    }
}
