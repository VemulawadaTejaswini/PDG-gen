import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int n = Integer.parseInt(a + b);

        if(Math.sqrt(n)==(int)Math.sqrt(n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    } 
}