import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
        int first = 0;
        int last = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int w = 0; w < n; w++){
        first = scan.nextInt();
        
        int num = 1;
        
        if(first < 0){
        num = 0;}
        else if(first == 1){
        num = 0;
         System.out.println(num);
        } else if (first == 2){
        num = 1;
         System.out.println(num);
        } else if (first == 3){
        num = 2;
         System.out.println(num);
        }else{
        
        for(int i=3; i< first+1; i+=2){
        boolean prime = true;
        for(int div = 3; div <= Math.sqrt(i); div+=2){
        if(i%div == 0){
        prime = false;
        break;
        }
     }
     if(prime== true){
     num = num + 1;
     }
  }
  System.out.println(num);
        
        }
        
      }
      
    }
     
}