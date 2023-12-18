//package cf;

import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt(), m = io.nextInt();
        int c = 0, s = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            s += (arr[i] = io.nextInt());
        for(int i = 0; i < n; i++)
            if((double)arr[i] >= (double)s/4/m) c++;
        System.out.println(c >= m ? "Yes" : "No");
    }
}

