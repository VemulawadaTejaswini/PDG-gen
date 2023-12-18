import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        String line1 = scanner.next();
        String line3 = scanner.next();

        int a = Integer.parseInt(line1);
        int b = Integer.parseInt(line3);

        if(a > b){
            System.out.println("a > b");
        }else if(a < b){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
        }
        
    }
}
