import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = Math.max(a, c);
        int min = Math.min(b, d);
        if(min >= max){
            System.out.println(min - max);
        }else{
            System.out.println(0);
        }


    }
}