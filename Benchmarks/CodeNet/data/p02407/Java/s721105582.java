import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)arr[i] = scan.nextInt();
        for(int i = n-1;i >= 0;i--){
            if(i != n-1)System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();

        scan.close();
    }  
}
