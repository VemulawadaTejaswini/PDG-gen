package jyp;

import java.util.*;
 
public class Main {
 
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            if(c<0)break;
            int ans=0;
            while(0<c){
                c/=10;
                ans++;
            }
            System.out.println(ans);
        }
    }
}