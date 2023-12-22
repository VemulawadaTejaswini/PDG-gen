import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String ia;

        int c = 1;
        while(true){
            ia = in.readLine();
            int tmp = Integer.parseInt(ia);
            if(tmp == 0){
                break;
            } else {
                System.out.println("Case " + c + ": " + tmp);
                ++c;
            }
        }
    }
}