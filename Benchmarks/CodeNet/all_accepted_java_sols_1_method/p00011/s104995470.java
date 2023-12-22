import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int w = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            int[] x = new int[w];
            for(int i = 0; i< w; i++){
                x[i] = i + 1;
            }
            int a ;
            int b ;
            for(int i = 0; i < n; i++){
                String line = reader.readLine();
                String[] s = line.split(",");
                a = Integer.parseInt(s[0]);
                b = Integer.parseInt(s[1]);
                int temp = x[a-1];
                x[a-1] = x[b-1];
                x[b-1] = temp;
            }
            for(int i = 0; i < w; i++){
                System.out.println(x[i]);
            }
        }catch(IOException e){

        }
    }
}
