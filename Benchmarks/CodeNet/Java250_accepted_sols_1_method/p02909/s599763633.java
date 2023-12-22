import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        String s = cin.nextLine();
        if(s.equals("Sunny")) cout.println("Cloudy");
        else if(s.equals("Cloudy")) cout.println("Rainy");
        else cout.println("Sunny");

        cout.close();
    }
}
