package jyp;

import java.util.*;
 
public class Main {
 
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            long c=a+b;
            if(c<0)break;
            int ans=0;
            while(10<=c){
                c/=10;
                ans++;
            }
            System.out.println(ans);
        }
    }
}