import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int ret=0;
        if(n == 100){
            System.out.println((int)Math.pow(100, d) * 101);
    }else{
            System.out.println((int)Math.pow(100, d) * n);
        }
    }
}

