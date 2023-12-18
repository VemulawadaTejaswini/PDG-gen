import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        //if K is an odd number
        //a,b,c must be multiple of K
        if(K%2!=0){
        	long multiple = N/K;
        	long ans = multiple*multiple*multiple;
        	System.out.println(ans);
        }
        //if K is an even number
        //first solution: a,b,c are multiple of K
        //second solution: a,b,c are K/2*[odd number]
        else{
        	long multiple = N/K;
        	long half = N/(K/2)-multiple;
        	long ans = multiple*multiple*multiple + half*half*half;
        	System.out.println(ans);
        }
    }
}