import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = word + word;
        String key = br.readLine();
        boolean result = false;

        if(word.indexOf(key) != -1){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}