import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String line = br.readLine();
            if(line.equals("0")){
                break;
            }
            
            char[] charArray = line.toCharArray();
            int total = 0;
            for(int i = 0; i < charArray.length; i++){
                char ch = charArray[i];
                total += Character.getNumericValue(ch);
            }
            
            System.out.println(total);
        }
    }
}