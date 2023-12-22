import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r1 = a + b;
        int r2 = a - b;
        int r3 = a * b;
        if(r1<r2){
            if(r2<r3){
                System.out.println(r3);
            }else{
                System.out.println(r2);
            }
        }else{
            if(r1<r3){
                System.out.println(r3);
            }else{
                System.out.println(r1);
            }
        }
        sc.close();
    }
}