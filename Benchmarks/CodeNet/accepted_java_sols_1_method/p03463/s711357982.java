import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        if((B-A) %2 == 0){
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
        in.close();
    }
}
