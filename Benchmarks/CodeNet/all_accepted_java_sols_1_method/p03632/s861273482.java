import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan_A = new Scanner(System.in);
        int a = scan_A.nextInt();
        int b = scan_A.nextInt();
        int c = scan_A.nextInt();
        int d = scan_A.nextInt();
        int ans;

        int max = Math.max(a,c);
        int min = Math.min(b,d);
        int count = min -max;
        ans = Math.max(0, count);
        /* if(a<c && b<d && b<= c||c<a && b<d && b<=a ||a<c && d<b && d <= c ||c<a && d<b && d<=a){
            ans = 0;
        }
            else if(a<c && b<d && c<d){
                ans = b-c;
            }else if(c<a && b<d && a<d){
                ans = b-a;
            }else if(a<c && d<b && c<b){
                ans = d-c;
            }else if(c<a && d<b && a<b){
                ans = d-a;
            }
        */    
            System.out.println(ans);
        
        
    }

}