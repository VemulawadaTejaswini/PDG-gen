import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if (a.charAt(0) == a.charAt(1) && (a.charAt(2) == a.charAt(3)) && (a.charAt(0) != a.charAt(2)))
            System.out.println("Yes");
        else if (a.charAt(0) == a.charAt(2) && (a.charAt(1) == a.charAt(3)) && (a.charAt(0) != a.charAt(1)))
            System.out.println("Yes");
        else if (a.charAt(0) == a.charAt(3) && (a.charAt(1) == a.charAt(2)) && (a.charAt(0) != a.charAt(1)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
