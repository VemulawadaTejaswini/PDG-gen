import java.io.*;
public class Main {
    public static void main(String[] args) {    
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        try{
            String text = reader.readLine();
            String word = reader.readLine();
            for(int i = 0; i < text.length() - word.length() + 1; i++){
            	if(text.substring(i,i + word.length()).equals(word)){
            		System.out.println(i);
            	}
            }       
        }catch(IOException e){
            System.out.println(e);
        }  
    }
}