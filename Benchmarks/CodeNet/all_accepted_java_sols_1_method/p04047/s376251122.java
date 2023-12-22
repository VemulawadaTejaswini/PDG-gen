import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[2*n];
        for(int i=0;i<2*n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<2*n;i+=2){
            ans+=arr[i];
        }
        System.out.println(ans);
    }
}