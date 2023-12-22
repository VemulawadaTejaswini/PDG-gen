
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ns = sc.next();
        int n = Integer.parseInt(ns);
        String p = "";
        for(int i=0;i<ns.length();i++)p+=ns.charAt(0);
        if(n<=Integer.parseInt(p))System.out.println(p);
        else{
            p = "";
            for(int i=0;i<ns.length();i++)p+=((char)(ns.charAt(0)+1));
            System.out.println(p);
        }

    }
}