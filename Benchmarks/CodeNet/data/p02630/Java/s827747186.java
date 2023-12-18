import java.util.Scanner;

public class Question1 {
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
       int b,c=0;
       while(q-->0) {
           b = s.nextInt();
           c = s.nextInt();
           for(int i = 0 ; i < n ; i++) {
               if(arr[i]==b) {
                   arr[i] = c;
                   sum = sum+(c-b);
               }
           }
           System.out.println(sum);
       }
   }
}
