
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        long n = Long.parseLong(in[0]);
        if(n>=30) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}