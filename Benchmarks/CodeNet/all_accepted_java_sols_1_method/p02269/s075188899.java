import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
 
public class Main {
    public static void main(String[] args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < n; ++i){
            String[] line = br.readLine().split(" ");
            if(line[0].charAt(0) == 'i')
                set.add(line[1]);
            else
                System.out.println(set.contains(line[1]) ? "yes" : "no");
        }
    }
}
