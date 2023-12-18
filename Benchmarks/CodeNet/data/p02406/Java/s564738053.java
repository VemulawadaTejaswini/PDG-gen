import java.util.*;
public class Main { 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) { 
              int x=i;
              if(x % 3 == 0){
                  System.out.print(" "+i);
              }
              else{
                 for (; x>=1; x /= 10) { 
                     if ( x % 10 == 3 ){
                         System.out.print(" "+i);
                         break;
                     }
                 } 
              }
        } 
         System.out.println();
    } 
} 
