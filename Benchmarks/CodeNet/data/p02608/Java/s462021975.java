import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int z = 0;
        
        for(int a = 1; a <= n; a++){
            int count = 0;
            for(int i = 1; i <= 100; i++){
                for(int j = 1; j <= 100; j++){
                    for(int k = 1; k <= 100; k++){
                        if(a == i * i + j * j + k * k + i * j + j * k + k * i){
                            count++;
                        }
                    }
                }
            }
            out.println(count);
        }
        
        out.close();
        
    }
}