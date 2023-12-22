import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            char[] ch = new char[1200];
            for(int i = 0; i < line.length();i++){
                ch[i] = line.charAt(i);
                if(ch[i] >= 'A' && ch[i] <= 'Z'){
                    ch[i] += 32;
                }else if(ch[i] >= 'a' && ch[i] <= 'z'){
                    ch[i] -= 32;
                }
                System.out.print(ch[i]);
            }
          System.out.println();
        }catch(IOException e){

        }
    }
}
