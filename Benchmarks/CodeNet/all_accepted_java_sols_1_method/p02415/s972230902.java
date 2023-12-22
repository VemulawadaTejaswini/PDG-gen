import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args ){
        //Scanner scan = new Scanner(System.in);
        //BufferedReader reader = new Bufferedreader(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] words;
        int i=0;
        try{
            //while((word[i] = scan.nextChar))
            String line = reader.readLine();
            words = line.toCharArray();
            //String newline = line.toLowerCase();
            for(i=0; i<words.length; i++){
                if(Character.isUpperCase(words[i])){
                    words[i] = Character.toLowerCase(words[i]);
                }else{
                    words[i] = Character.toUpperCase(words[i]);
                }
            }
            StringBuffer newline = new StringBuffer(new String(words));
            System.out.println(newline);

        }catch(IOException e){
            System.out.println(e);
        }

    }
}
