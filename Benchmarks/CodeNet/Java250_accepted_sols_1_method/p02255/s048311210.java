import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final PrintWriter out = new PrintWriter(System.out);
        final int n = Integer.parseInt(sc.next());
        final int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        out.print(a[0]);
        for(int i = 1; i<n; i++)
            out.print(" "+a[i]);
        out.println();
        for(int i = 1; i<n; i++){
            final int v = a[i];
            int j = i-1;
            while(j>=0&&a[j]>v){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
            out.print(a[0]);
            for(int k = 1; k<n; k++)
                out.print(" "+a[k]);
            out.println();
        }
        out.flush();
    }
}