import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c){
            System.out.println("1");
        }else if (a != b && b == c ){
            System.out.println("2");
        }else if (c != b && a == b ){
            System.out.println("2");
        }else if (a != b && a == c ){
            System.out.println("2");
        }else{
            System.out.println("3");
        }
    }
}
