import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        try { 
            Scanner sc = new Scanner(System.in);
        while(true){
            String str = reader.readLine();
            if(str.equals("0")){
                break;
            }
            int m=0;
            for(int i=0;i<str.length();i++){
            char c = str.charAt(i); 
                 if(c == '1'){
                     m=m+1;
                 }else if(c == '2'){
                     m=m+2;
                 }else if(c == '3'){
                     m=m+3;
                 }else if(c == '4'){
                     m=m+4;
                 }else if(c == '5'){
                     m=m+5;
                 }else if(c == '6'){
                     m=m+6;
                 }else if(c == '7'){
                     m=m+7;
                 }else if(c == '8'){
                     m=m+8;
                 }else if(c == '9'){
                     m=m+9;
                 }
                 }
                 System.out.println(m);
                 }
                 } catch (IOException e) { 
                 System.out.println(e); 
                 }
        }
    }
