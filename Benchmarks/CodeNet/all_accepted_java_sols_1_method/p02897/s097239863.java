import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int n = cin.nextInt();
        if(n % 2 == 0) {
            cout.println((n/2.0)/n);
        }
        else {
             cout.println(((n+1)/2.0)/n);
        }

        cout.close();
    }
}