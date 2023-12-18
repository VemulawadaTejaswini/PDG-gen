import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] str = in.readLine().split(" ");
        int[] length = new int[n];
        for(int i=0; i<n; i++){
            length[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(length);
        int i=0;
        while(true){
            System.out.print(length[i]);
            if(++i==n){
                System.out.print("\n");
                break;
            }
            else{
                System.out.print(" ");
            }
        }

        in.close();
    }
}