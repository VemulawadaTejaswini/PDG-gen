import java.io.*;
import java.util.*;
   
class Main{
      public static void main(String[] args) {
       int count =0;
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
           int n = sc.nextInt();
           int [] array = new int[n];
         for(int i=0; i<n-1; i++){
             array[i] = sc.nextInt();
           }
 
          for(int j=0; j<array.length-1; j++){
            for(int k=n-1; j<k; k--){
                if(array[k] < array[k-1]){
                    int a = array[k];
                    int b = array[k-1];
                    array[k] = b;
                    array[k-1]= a;
                    count++;
                }
              }
           }
         for (int i = 1; i < n-1; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(count);

     }
  }
}