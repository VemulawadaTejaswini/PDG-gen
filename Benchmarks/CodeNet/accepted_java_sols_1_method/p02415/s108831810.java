import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        char[] data = line.toCharArray();
        for(int i=0; i<data.length; i++){
            if(Character.isUpperCase(data[i])) {
                sb.append(Character.toLowerCase(data[i]));
            } else if(Character.isLowerCase(data[i])) {
                sb.append(Character.toUpperCase(data[i]));
            } else {
                sb.append(data[i]);
            }
        }
        System.out.println(new String(sb));
    }
}

