import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        Integer[] data = makeint(br);
        Integer W = data[0], H = data[1], x = data[2], y = data[3], r = data[4];
        if(x >= r && x + r <= W && y >= r && y + r <= H){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void show(Integer[] a){
        int n = a.length;
        for(int i = 0; i < n - 1; i++){ System.out.print(a[i] + " "); }
        System.out.println(a[n - 1]);
    }
    public static Integer[] makeint(BufferedReader br) throws IOException
    {
        String[] str = br.readLine().split(" ");
        int n = str.length;
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++){ a[i] = Integer.parseInt(str[i]); }
        return a;
    }
}
