import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int k =sc.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<k;i++)
            {
                int x = sc.nextInt();
                for(int j=0;j<x;j++)
                {
                    int l =sc.nextInt();
                    arr[l-1]=arr[l-1]+1;
                }
            }

            int count =0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    count=count+1;
                }
            }
            System.out.println(count);




    }


}