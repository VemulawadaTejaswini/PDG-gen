import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        
        int m = 0;
        int n = 0;


        m = N/((D*2)+1);
        n = N%((D*2)+1);

        if(n != 0){
            m+=1;
        }

        if(D >= N){
            m = 1;
        }

        System.out.println(m);
        
    }

}