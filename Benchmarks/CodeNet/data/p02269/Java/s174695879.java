import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        String line = br.readLine();
        while(line != null){
            String[] xs = line.split(" ");
            if(xs[0].equals("insert")){
                map.put(xs[1], true);
            }else if(xs[0].equals("find")){
                System.out.println(map.containsKey(xs[1]) ? "yes" : "no");
            }
            line = br.readLine();
        }
    }
}
