import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner scan_A = new Scanner(System.in);
        int x = scan_A.nextInt();

       
        int a = scan_A.nextInt();

        int ans_a;
        int b = scan_A.nextInt();
        int ans_b;
        if(x-a<0){
            ans_a= a-x;
        }else{
            ans_a = x-a;
        }

        if(x-b<0){
            ans_b = b-x;
        }else{
            ans_b = x-b;
        }
        
        if(ans_a < ans_b){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
               
        
    }

}