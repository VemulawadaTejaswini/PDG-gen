import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader scan = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine());
        Map<String, String> seq = new HashMap<>();
        for(int x = 0; x < n; x++){
            String check = scan.readLine();
            if(check.startsWith("insert")){
                seq.put(check.substring(7), check.substring(7));
            }
            else{
                if(seq.containsKey(check.substring(5))){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
        }
    }
}
