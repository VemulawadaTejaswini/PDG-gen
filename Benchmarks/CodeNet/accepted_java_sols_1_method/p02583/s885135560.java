
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
               int n=scan.nextInt();
               int[] arr=new int[n];
               for(int i=0;i<n;i++){
                   arr[i]=scan.nextInt();
               }
           Arrays.sort(arr);
               int count=0;
               for(int i=0;i<n;i++){
                   for(int j=i+1;j<n;j++){
                       for(int k=j+1;k<n;k++){
                           if(arr[i]+arr[j]>arr[k] && arr[i]!=arr[j] && arr[j]!=arr[k]){
                               count++;
                           }
                       }
                   }
               }
               System.out.print(count);
    }
}
