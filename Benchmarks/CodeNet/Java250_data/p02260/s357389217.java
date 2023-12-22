import java.io.*;
import java.util.*;
  
public class Main {
    public static void main(String[] args) throws Exception {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          
        int[] array = new int[n];
            for(int i = 0; i<n; i++){
                array[i] = sc.nextInt();
            }
        for(int i=0; i<array.length-1; i++){
            int min =i;
            for(int j = i+1; j<array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
             if(i != min){
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
                count += 1;
}
        }
        for(int k=0; k<array.length-1; k++){
            int number = array[k];
            System.out.print(number + " ");
        }
        System.out.println(array[array.length-1]);
        System.out.println(count);
          
    }
}