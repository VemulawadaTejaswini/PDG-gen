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

        int i=0;
        while(i < word.length()/2){
        	int index = word.indexOf(key.charAt(0), i);

        	if(index + key.length() > word.length() || index == -1)break;

        	String tmp = word.substring(index, index + key.length());
        	if(key.equals(tmp)){
        		result = true;
        		break;
        	}else{
        		i = index + 1;
        	}
        }

        if(result){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}