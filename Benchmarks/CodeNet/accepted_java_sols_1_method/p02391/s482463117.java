import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a<b){
            System.out.println("a < b");
        }else if(a>b){
            System.out.println("a > b");
        }else if(a==b){
            System.out.println("a == b");
        }
    }
}

