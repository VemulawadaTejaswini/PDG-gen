import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String patt = in.next().toLowerCase();

        int cnt = 0;

        while(true){
            String word = in.next();
            if(word.equals("END_OF_TEXT"))break;

            if(word.toLowerCase().equals(patt))cnt++;
        }   

        System.out.println(cnt);
    }
}
