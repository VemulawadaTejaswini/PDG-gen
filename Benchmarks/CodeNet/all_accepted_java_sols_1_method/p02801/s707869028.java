import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char c = (char) System.in.read();
        int b=0;
        if( c>=97 && c<122){
            b = c + 1;
        }
        else {
            System.out.println("Not allowed");
        }
        c =(char)b;
        System.out.println(c);
    }
}