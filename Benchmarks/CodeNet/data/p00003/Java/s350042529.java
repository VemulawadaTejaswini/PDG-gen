import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int arr[]=new int[3];
        int n;
        Scanner reader = new Scanner(System.in);
        n=reader.nextInt();
        for (int i=0;i<n;i++){
            arr[0]=reader.nextInt();
            arr[1]=reader.nextInt();
            arr[2]=reader.nextInt();
Arrays.sort(arr);
            if (arr[0]+arr[1]>arr[2]){
            arr[0]^=2; arr[1]^=2; arr[2]^=2;
            
            if (arr[0]+arr[1]==arr[2])
                System.out.println("YES");
            else System.out.println("NO");
            }
            else System.out.println("NO");
        }
     
    } 
}