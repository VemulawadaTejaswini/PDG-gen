import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    static String dogName(long N){
        if(N==0) return "";
        return dogName((N-1)/26)+((char)((N-1)%26 + 'a'));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(dogName(N));
        
    }
}
