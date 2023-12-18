import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abc = br.readLine().split(" ");
        Arrays.sort(abc);
        
        System.out.println(String.join(" ", abc));
        br.close();
        } catch (Exception e){
            
        }

    }
}
