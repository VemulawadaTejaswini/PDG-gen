import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader r = 
        new BufferedReader(new InputStreamReader(System.in));
        
        int[] a;
        a = new int[10];
        for (int i = 0; i < 10; i++){
            String s = r.readLine();
            a[i] = Integer.valueOf(s);
        }
        Arrays.sort(a);
        for (int i = 9; i >6; i--){
            System.out.println(a[i]);
        }            
    }
}