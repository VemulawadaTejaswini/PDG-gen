import java.io.*;
import java.util.*;


public class Main {
    public static void main (String[]args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[n];
        int totalVotes=0;
        for (int i=0;i<n;i++){
            int helper=scanner.nextInt();
            a[i]=helper;
            totalVotes+=helper;
        }
        int numItems=0;
        for (int i=0;i<n;i++){
            float helper=((float)totalVotes*(float)(1/(4*(float)m)));
            if (a[i]>=helper){
                numItems++;
            }
        }
        System.out.println(numItems>=m? "Yes":"No");
    }
}
