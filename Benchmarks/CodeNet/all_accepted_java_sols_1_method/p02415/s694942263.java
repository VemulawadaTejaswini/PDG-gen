import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<line.length();i++){
            if(Character.isLowerCase(line.charAt(i))){
                sb.append(String.valueOf(line.charAt(i)).toUpperCase());
            }else {
                sb.append(String.valueOf(line.charAt(i)).toLowerCase());
            }
        }
        System.out.println(sb.toString());
    }
}