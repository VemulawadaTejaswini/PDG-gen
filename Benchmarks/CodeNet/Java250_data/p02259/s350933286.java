import java.io.*;
import java.util.*;
  
class Main{
      public static void main(String[] args) {
       int narabi =0;
       int count =0;
       Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int [] array = new int[n];
         for(int i=0; i<n; i++){
             array[i] = sc.nextInt();
           }
           
          for(int i=0; i<array.length-1; i++){
            for(int j=array.length-1; j>0; j--){
                if(array[j] < array[j-1]){
                    int a = array[j];
                    int b = array[j-1];
                    array[j] = b;
                    array[j-1]= a;
                    count++;
                }
              }
           }
            for(int k =0; k<array.length-1; k++){
            int number = array[k];
            System.out.print(number + " ");
             }
             System.out.println(array[array.length-1]);
             System.out.println(count);
        }

     }