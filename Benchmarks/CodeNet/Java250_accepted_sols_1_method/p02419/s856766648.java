import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String word = br.readLine();
            int count = 0;
            String line = "";
            
            while(true){
                line = br.readLine();
                if("END_OF_TEXT".equals(line)){
                    break;
                }
                String[] arr = line.split("\\s");
                for(int i=0; i<arr.length; i++){
                    if(arr[i].toLowerCase().equals(word)){
                        count++;
                    }
                }
            }
            
            System.out.println(String.valueOf(count));
            
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
