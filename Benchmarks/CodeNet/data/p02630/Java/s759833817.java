
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int arr[] =new int[n];
       long sum = 0;
       for(int i =0; i < n; i++) {
           arr[i] = s.nextInt();
           sum += arr[i];
       }
       int q = s.nextInt();
       int b,c=0,count=0;
       while(q-->0) {
           b = s.nextInt();
           c = s.nextInt();
           count=0;
           for(int i = 0 ; i < n ; i++) {
               if(arr[i]==b) {
                   arr[i] = c;
                   count++;
               }    
           }
           sum= sum+(count*(c-b));
           System.out.println(sum);
       }
   }
}
