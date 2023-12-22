import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        if (in.toUpperCase().equals(in)) {
            System.out.println("A");
        }
        else {
            System.out.println("a");
        }
    }
}
