import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        char c[] = scan.nextChar();
        for(int i = 0; i < c.length; i++){
            if(Character.isUpperCase(c[i])){
                c[i] = Character.toLowerCase(c[i]);
            }else if(Character.isLowerCase(c[i])){
                c[i] = Character.toUpperCase(c[i]);
            }else{
                c[i] = c[i];
            }
        }
        
        System.out.println(c);
    }
}