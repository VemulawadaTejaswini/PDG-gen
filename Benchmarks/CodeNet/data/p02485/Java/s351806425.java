import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            String str = in.readLine();
            if(str.equals("0") == true) break;

            int sum = 0;
            for(int i=0; i<str.length(); i++){
                sum += Character.getNumericValue(str.charAt(i));
            }

            sb.append(sum + "\n");
        }

        System.out.print(sb);
        in.close();
    }
}