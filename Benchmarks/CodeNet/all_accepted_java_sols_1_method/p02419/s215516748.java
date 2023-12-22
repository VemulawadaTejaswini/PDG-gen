import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        String t = "";
        int count = 0;
        while(!(t = br.readLine()).equals("END_OF_TEXT")){
            t = t.toLowerCase();
            String[] words = t.split(" ");
            for(int i=0; i < words.length; i++){
                if(words[i].equals(w)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}