import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        String c[] = scan.next();
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