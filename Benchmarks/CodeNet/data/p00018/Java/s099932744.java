import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(array[array.length-1]);
        for (int i = array.length-2; i>-1; i--){
            sb.append(" " + array[i]);
        }
        System.out.println(sb.toString());
    }
}