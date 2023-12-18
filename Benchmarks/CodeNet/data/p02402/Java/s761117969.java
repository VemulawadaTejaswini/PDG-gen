import java.io.*;
import java.util.Scanner;
import java.math.*;
 
class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] data = makeint(br);
 
        System.out.println("2 3 4");
 
        int maximum, minimum, sum = data[0];
        return;         

    }
 
    public static int[] makeint(BufferedReader br) throws IOException
    {
        String[] str = br.readLine().split(" ");
        int n = str.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){ a[i] = Integer.parseInt(str[i]); }
        return a;
    }
}
