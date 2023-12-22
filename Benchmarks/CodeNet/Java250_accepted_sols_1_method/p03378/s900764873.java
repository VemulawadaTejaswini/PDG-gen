import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int a = 0;
        int b = 0;

        for(int i=0; i<M; i++){
            if(sc.nextInt()<X){
                a += 1;
            }
            else{
                b += 1;
            }
        }
        if(a<=b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    } 
}