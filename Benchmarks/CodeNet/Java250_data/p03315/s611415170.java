import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
 
 
class Main
{
    public static void main(String[] args)
    {
        int ans = 0;
        int count = 0;
        int a;
        
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        //int m = scanner.nextInt();
        String[] ar = n.split("");
        a = n.length();
        for(int i = 0; i < a;i++){
            switch (ar[i]){
                case "+":
                    ans = ans + 1;
                    break;
                case "-":
                    ans = ans - 1;
                    break;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}