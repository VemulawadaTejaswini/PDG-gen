import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(std.readLine());
        String str = std.readLine();
        String[] strs = str.split(" ");
        
        for(int i = strs.length-1; i >= 0; i--){
            if(i != 0){
                System.out.print(strs[i] + " ");
            } else {
                System.out.print(strs[i]);
            }
        }
        System.out.println();
    
    }

}