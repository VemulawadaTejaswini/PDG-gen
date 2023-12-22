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
        int count = 0;
        int s[] = new int[100000000];
        
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        for(int i = 0; i< d; i++){
            s[i] = scanner.nextInt();
        }

        for(int j = 0; j< d ;j++){
            ans = s[j];
            while(ans % 2 ==0){
                count++;
                ans = ans/2;
            }      
        }
        System.out.println(count);
        scanner.close();
    }
}