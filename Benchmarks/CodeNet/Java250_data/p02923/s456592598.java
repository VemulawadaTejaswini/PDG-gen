  
import java.util.Scanner;
 class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int count = 0 ;
        int max = 0 ;
        for(int i = 0 ; i< n-1 ;i++){
           if(arr[i+1]<= arr[i]){
               count++;
               //System.out.println(count);
           }else{
               //System.out.println(count);
               if(max<count)
                   max = count ;
               count = 0 ;
           }
        }
         if(max<count)
                   max = count ;
        
        System.out.println(max);
    }
}
