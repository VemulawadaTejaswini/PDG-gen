import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();

        int count = 0;

        while(true){
            String input = br.readLine();
            String[] word = input.split(" ");

            if(word[0].equals("END_OF_TEXT")){
                break;
            }

            for(int i = 0; i < word.length; i++){
//              ??¨????°????????????????
                word[i] = word[i].toLowerCase();

                if(word[i].equals(target)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}