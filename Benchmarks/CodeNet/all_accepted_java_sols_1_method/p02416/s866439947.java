import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
                String line = reader.readLine();
                if(line.equals("0")){
                    break;
               }
               char[] c = line.toCharArray();
                int sum = 0;
                for(char x:c){
                    int a = x - '0';
                    sum += a;
                }
                System.out.println(sum);
            }
        }catch(IOException e){

        }
    }
}
