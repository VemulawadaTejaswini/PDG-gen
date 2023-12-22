import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if (a.equals("Sunny"))
            System.out.println("Cloudy");
        else if (a.equals("Cloudy"))
            System.out.println("Rainy");
        else if (a.equals("Rainy"))
            System.out.println("Sunny");
    }
}
