import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int i = 1;
        while(true){
            str = br.readLine();
            if(str.equals("0")){
                break;
            }//if
            System.out.println("Case " + i + ": " + str);
            i++;
        }//while
        br.close();
    }
}