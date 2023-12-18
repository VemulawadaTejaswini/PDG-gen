import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true){
                String line = br.readLine();
                if(line.equals("0")) {
                    break;
                }
                char[] data = line.toCharArray();
                int a = 0;
                for(int i=0; i<data.length; i++){
                    a += Character.getNumericValue(data[i]);
                }
                System.out.println(String.valueOf(a));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
