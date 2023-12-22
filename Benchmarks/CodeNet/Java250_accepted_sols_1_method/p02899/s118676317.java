import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int n = cin.nextInt();
        int[] line = new int[n];
        for(int i=1;i<=n;i++) {
            line[cin.nextInt()-1] = i;
        }
        
        for(int x : line) cout.print(x + " ");
        cout.println();
        cout.close();
    }
}