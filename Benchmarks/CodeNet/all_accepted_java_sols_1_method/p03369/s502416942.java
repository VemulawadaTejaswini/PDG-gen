import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                int r=0;
                for(int i=0; i<3; i++){
                    if(line.charAt(i) == 'o')r++;
                }
                System.out.println(700 + 100*r);
            }
        }
    }
}