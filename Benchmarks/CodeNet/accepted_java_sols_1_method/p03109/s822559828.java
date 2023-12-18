import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int m = Integer.parseInt(a.substring(5,7));
        int d = Integer.parseInt(a.substring(8,10));

        if (m<=4 && d <= 30)
            System.out.println("Heisei");
        else
            System.out.println("TBD");
    }
}
