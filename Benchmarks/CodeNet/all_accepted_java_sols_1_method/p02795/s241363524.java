import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int max = Math.max(h,w);
        if(n % max != 0){
            System.out.println(n/max+1);
        }else{
            System.out.println(n/max);
        }
    }
}