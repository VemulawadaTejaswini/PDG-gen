import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.charAt(0) == b.charAt(2) && a.charAt(1) == b.charAt(1) && a.charAt(2) == b.charAt(0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
