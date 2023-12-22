import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        String line1 = scanner.next();
        String line3 = scanner.next();

        int a = Integer.parseInt(line1);
        int b = Integer.parseInt(line3);
        int c,num;
        if(a == b){
            c = a;
        }else if(a >= b){
            c = a % b;
        }else{
            c = b % a;
            b = a;
        }
        for(int i = c;i >= 1;i--){
            if(b % i == 0 && c % i == 0){
                System.out.println(i);
                break;
            }
        }

    }
}
