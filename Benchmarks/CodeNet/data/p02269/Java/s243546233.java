import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
 
public class Main {
 
    private static final int BIG_NUM  = 2000000000;
    private static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_str[] = new String[2];
 
        Set<String> Dictionary = new HashSet<String>();
        StringBuilder ans = new StringBuilder();
 
        try {
            int Q = Integer.parseInt(br.readLine());
 
            for(int loop = 0; loop < Q; loop++){
 
                input_str = br.readLine().split("\\s+");
 
                if(input_str[0].equals("insert")){
                    Dictionary.add(input_str[1]);
                }else{ //find
                    if(Dictionary.contains(input_str[1])){
                        ans.append("yes\n");
                    }else{
                        ans.append("no\n");
                    }
                }
            }
 
            System.out.print(ans.toString());
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
