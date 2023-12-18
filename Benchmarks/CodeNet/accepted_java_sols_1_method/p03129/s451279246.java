import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] sArray = s.split(" ", 0);

        if (sArray.length != 2){
            System.out.println("Input argument error.");
            return;
        }

        int n = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);

        int val = 1;
        int count = 1;
        while(val <= n){
            count++;
            val += 2;
        }

        if(count > k){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}