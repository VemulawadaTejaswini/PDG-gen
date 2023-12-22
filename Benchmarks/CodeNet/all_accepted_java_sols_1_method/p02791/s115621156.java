import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0,m=0;
        if(scan.hasNext())
            n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(scan.hasNext())
                arr[i]=scan.nextInt();
        }
        int min=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]<=min){
                count++;
            }
            min=Math.min(arr[i],min);
        }
        System.out.println(count);
    }
}
