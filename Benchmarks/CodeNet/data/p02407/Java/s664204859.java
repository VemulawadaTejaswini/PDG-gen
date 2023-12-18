import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            String a = br.readLine();
            String[] arr = br.readLine().split(" ");
            for(int i=arr.length-1; i>=0; i--){
                sb.append(arr[i]);
                if(i!=0) {
                    sb.append(" ");
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(sb));
    }
}
