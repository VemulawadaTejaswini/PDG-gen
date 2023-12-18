import java.util.Scanner;

import java.io.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        char s;
        for(int i=0;i<line.length();i++){
            s = line.charAt(i);
            if(Character.isUpperCase(line.charAt(i))){
                s += 32;
            }
            else if(Character.isLowerCase(line.charAt(i))){
                s -= 32;
            }
            System.out.printf("%c",s);
        }
        System.out.println();
    }
}
