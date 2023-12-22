import java.util.*;
import java.io.*;

public class Main {
    public static void main(String... args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password = null;
        try {

            password = br.readLine();
            br.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println(isDifficultToInput(password) ? "Bad" : "Good");
    }

    private static boolean isDifficultToInput(String word){
        String[] splitWord = word.split("");

        for(int i = 0; i < splitWord.length - 1; i++){
            String rear = splitWord[i];
            String front = splitWord[i+1];
            if(front.equals(rear)){
                return true;
            }
        }
        return false;
    }
}