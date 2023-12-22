import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        boolean f = false;
        for(int c=1;c<=X;c++){
            if(100*c<=X&&X<=105*c){
                f = true;
                break;
            }
        }
        if(f == true){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}