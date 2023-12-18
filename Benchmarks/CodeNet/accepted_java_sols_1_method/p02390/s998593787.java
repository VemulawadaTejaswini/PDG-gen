import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
     int b = a/3600;
     int c = a%3600;
     int d = c/60;
     int e = c%60;
     System.out.println(b+":"+d+":"+e);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String line = br.readLine();
    }
}

