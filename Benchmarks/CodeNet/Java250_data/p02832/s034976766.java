import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = io.nextInt();
        int f = 1;
        for(int i = 0; i < n; i++)
            if(arr[i] == f && f++ > 0);
        System.out.println(f == 1 ? -1 : n-f+1);
    }
}
