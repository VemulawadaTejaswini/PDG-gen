import java.lang.String;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
    int count =0;
        for(int i=0; i<=a; i++)
            for(int j=0; j<=b; j++)
                for (int u=0; u<=c; u++) {
            if(i*500+j*100+u*50==x) {count++;}
                }
    System.out.println(count);

    }

}