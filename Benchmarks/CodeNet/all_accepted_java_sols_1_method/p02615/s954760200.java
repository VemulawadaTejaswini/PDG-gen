import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);

        long comfort = arr[N-1];
        int x = N-2;
        int y = N-5;
        for(int i=N-3;i>=0;i--)
        {
            if(i==y)
            {
                x--;
                y = i-2;
            }
            comfort += arr[x];
        }

        System.out.println(comfort);
    }
}