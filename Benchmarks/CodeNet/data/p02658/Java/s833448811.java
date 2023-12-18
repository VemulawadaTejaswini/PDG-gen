
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
     int a= sc.nextInt();
     long sum=1;
     while(a--!=0){
       long x=sc.nextLong();
         sum*=x;
    }

     if(sum>(long)1e18) System.out.println(-1);
     else System.out.println((long)sum);
        //System.out.println(101*9901*999999000001l);
    }
}