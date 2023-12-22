import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner fr = new Scanner(System.in);
        int n = fr.nextInt();
        int x = fr.nextInt();
        int xx = x;
        int t = fr.nextInt();
        int tt = t;
        if(n<x){
            System.out.println(t);
        }
        else{
            while(x<n){
                x+=xx;
                t+=tt;
            }
            System.out.println(t);
        }
    }
}
