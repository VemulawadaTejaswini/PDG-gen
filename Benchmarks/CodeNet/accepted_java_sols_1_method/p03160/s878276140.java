import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


       // BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int a = 0;
        int b = Math.abs(arr[1]-arr[0]);

        if(n==2){
            System.out.println(b);
            System.exit(0);
        }

        int c = 0;

        for(int i=2;i<n;i++) {
            c = Math.min(Math.abs(arr[i]-arr[i-1])+b, Math.abs(arr[i]-arr[i-2])+a);
            a = b;
            b = c;
        }

        System.out.println(c);
    }
}