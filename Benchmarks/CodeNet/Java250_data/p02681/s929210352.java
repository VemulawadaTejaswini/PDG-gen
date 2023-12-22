import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.equals(b.substring(0,b.length()-1)) && (b.length() == (a.length()+1)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
