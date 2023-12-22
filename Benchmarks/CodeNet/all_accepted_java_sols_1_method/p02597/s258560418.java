import java.util.Scanner;
import java.time.Year;
import java.util.Random;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n = sc.nextInt();
        String a = sc.next();
        char r = 'R';
        char w = 'W';
        int r_count = 0;
        int w_count = 0;
        int munipu = 0;
        for(int i=0; i<n; i++){
            if(a.charAt(i)==r){
                r_count++;
            }
        }
        for(int i=0; i<r_count; i++)
            if(a.charAt(i)!=r){
                munipu++;
            }
        System.out.println(munipu);
    }
}