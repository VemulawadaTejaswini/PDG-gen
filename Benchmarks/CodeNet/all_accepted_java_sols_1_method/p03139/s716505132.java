import java.io.*;
import java.util.Scanner;

public class Main{

     public static void main(String[] args){
        
        try{
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] inputs = str.split(" ");

            //格納(N A B)
            int n = Integer.parseInt(inputs[0]);
            int a = Integer.parseInt(inputs[1]);
            int b = Integer.parseInt(inputs[2]);
            
            int max = 0;
            int min = 0;
            
            //max算出
            if(a <= b){
                max = a;
            }else{
                max = b;
            }
            
            //min算出
            int tmp = a + b - n;
            
            if(tmp >= 0){
                min = tmp;
            }else{
                min = 0;
            }
            
            System.out.println( max + " " + min );
            
        
         }catch(Exception e){
        
           System.out.println(e); 
           
         }
     }
}