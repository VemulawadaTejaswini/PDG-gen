
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("Sunny"))
        System.out.println("Cloudy");
        else if(s.equals("Cloudy"))
        System.out.println("Rainy");
        else
        System.out.println("Sunny");
        sc.close();
    }
}