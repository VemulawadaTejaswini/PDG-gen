import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            h -= sc.nextInt();
        }
        if(h <= 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}