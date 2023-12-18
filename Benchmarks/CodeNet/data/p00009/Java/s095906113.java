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
        while (scan.hasNext()){
        first = scan.nextInt();
        
        int num = 0;
        
        for(int i=2; i< first+1; i++){
        boolean prime = true;
        for(int div = 2; div < i; div++){
        if(i%div == 0 && div != i){
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