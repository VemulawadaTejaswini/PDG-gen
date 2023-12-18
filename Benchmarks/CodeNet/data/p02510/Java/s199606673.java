import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.next();
            if(str.equals("-")) break;
            int n = sc.nextInt();
            int h;
            for(int i=0;i<n;i++) {
                h = sc.nextInt();
                str = str.substring(h) + str.substring(0,h);
            }
            System.out.println(str);
        }
    }
}