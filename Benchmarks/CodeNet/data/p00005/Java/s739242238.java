import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        int a = 0;
        int b = 0;
        int c = 0;
 
        while(sc.hasNext()){
 
            x = sc.nextInt();
            y = sc.nextInt();

            a = x;
            b = y;

            while(a != b){
                if(a >= b){
                    c = a;
                    a = b;
                    b = c - b;
                }else{
                    b = b - a;
                }
            }
            System.out.print(a);
            System.out.print(" ");
            System.out.println((x/a)*y); 
        }
    }
}