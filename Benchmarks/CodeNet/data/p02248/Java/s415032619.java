import java.io.*;
public class Main {
    public static void main(String[] args) {    
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        try{
            String text = reader.readLine();
            String word = reader.readLine();
            
            int index = text.indexOf(word);
            while (index > -1) {
            	System.out.println(index);
            	index = text.indexOf(word, index + 1);
            }
        }catch(IOException e){
            System.out.println(e);
        }  
    }
}