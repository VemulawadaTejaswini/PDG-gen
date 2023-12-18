import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[4];
        int n = scan.nextInt();
        
        while(n-- > 0){
            String temp = scan.next();
            switch(temp){
                case "G":
                    arr[0]++;
                    break;
                
                case "W":
                    arr[1]++;
                    break;
                    
                case "Y":
                    arr[2]++;
                    break;
                    
                case "P":
                    arr[3]++;
                    break;
            }
        }
        
        int ans = 0;
        for(int i : arr)
            if(i > 0) ans++;
            
        switch(ans){
            case 1:
                System.out.println("One");
                break;
                
            case 2:
                System.out.println("Two");
                break;
                
            case 3:
                System.out.println("Three");
                break;
                
            case 4:
                System.out.println("Four");
                break;
        }
        
    }
}
