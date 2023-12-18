import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
 
 
class Main
{
    public static void main(String[] args)
    {
        int ans = 0;
        
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        
        switch (d){
            case 0:
                if(n==100){
                    System.out.println(n+1);
                }else{
                System.out.println(n);
                }
                break;
            case 1:
                if(n==100){
                    System.out.println(n*100+100);
                }else{
                System.out.println(n*100);
                }
                break;
            case 2:
                if(n==100){
                    System.out.println(n*10000+10000);
                }else{
                System.out.println(n*10000);
                }
                break;
        }
        scanner.close();
    }
}