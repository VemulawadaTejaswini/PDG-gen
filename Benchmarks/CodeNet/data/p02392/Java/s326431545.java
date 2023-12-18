import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a<b&&b<c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

