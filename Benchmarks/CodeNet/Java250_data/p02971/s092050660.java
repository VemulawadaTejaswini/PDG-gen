 
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

  class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int arr[] = new int[x];
        int arr2[] = new int[x];
        for(int i = 0 ; i<x ; i++){
            arr[i]=scan.nextInt();
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2);
        int max1 = arr2[x-1];
        int max2 = arr2[x-2];
        for(int i = 0 ; i<x ; i++){
            if(arr[i]==max1){
                System.out.println(max2);
            }else{
                System.out.println(max1);
            }
        }
        
         
        
    }
}
