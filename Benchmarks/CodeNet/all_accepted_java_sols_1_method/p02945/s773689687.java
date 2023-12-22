import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = a + b;
        int y = a - b;
        int z = a * b;
        int out = 0;
        if(x >= y && x >= z){
            out = x;
        }else if(y >= z && y >= x){
            out = y;
        }else if(z >= x && z >= y){
            out = z;
        }
        System.out.println(out);
    }
}