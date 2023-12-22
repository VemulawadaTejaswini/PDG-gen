import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int A = input.nextInt();
         int B = input.nextInt();
         int C = input.nextInt();
         
         int N = A-B;
         int count = C-N;
         if(count < 0)
         {
             System.out.println("0");
         }
         else
         {
             System.out.println(count);
         }
         
    }
    
}
