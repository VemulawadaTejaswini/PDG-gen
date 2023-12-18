import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String str = br.readLine();

            if (str.equals("0"))
            break;

            int len = str.length();
            int sum = 0;
    
            for(int i = 0;i < len; i++){
                sum += str.charAt(i) - '0';
            }
            System.out.println(sum);
           
        }
    }
}
