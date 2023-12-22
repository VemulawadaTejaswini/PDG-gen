import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        for (int i=1;i<n-1;i++){
            if ((arr[i]>arr[i-1] && arr[i]<arr[i+1]) || (arr[i]<arr[i-1] && arr[i]>arr[i+1]) ){
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}

