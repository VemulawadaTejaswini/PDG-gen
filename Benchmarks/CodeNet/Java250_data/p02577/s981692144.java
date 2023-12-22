
/*
 *   
 *   Date: 07 September 2019
 *   Time: 01:03:00
*/
import java.io.*; 
import java.util.*;


   
 class Main 
{   
 static boolean check(String str) 
    { 
        long n = str.length(); 
        long digitSum = 0; 
        for (int i=0; i<n; i++) 
            digitSum += (str.charAt(i)-'0'); 
       
        return (digitSum % 9 == 0); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s=sc.next();
         if(check(s)){
         	System.out.println("Yes");
         }else{
         	System.out.println("No");
         }
        
       

       
    } 
} 
 
 
 
