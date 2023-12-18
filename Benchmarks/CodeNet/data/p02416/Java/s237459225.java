import java.util.Scanner;

//import jdk.internal.org.jline.utils.InputStreamReader;

import java.io.*;

public class Main{
        public static void main(final String[] args){
            Scanner scanner = new Scanner(System.in);
            while(true){
                String string = scanner.nextLine();
                int length = string.length();
                int s = 0;
                for(int i = 0; i < length; i++){
                    char charx = string.charAt(i);
                    int x = charx - '0';
                    s += x;
                }
                if(s == 0){
                    break;
                }
                System.out.println(s);
            }
            scanner.close();
        }
         

}
