import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            String s = String.valueOf(v1 + v2);
            System.out.println(s.length());
        }
    }
}