import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        boolean flag = false;
        int result = 0;
        for(int i = 1; i <= 5; i++){
            flag = flag || (n == Math.pow(10,i));
        }
        if(flag){
            result = 10;
        } else {
            while(n != 0){
                result = result + n % 10;
                n = n / 10;
            }
        }
        System.out.println(result);
    }
}
