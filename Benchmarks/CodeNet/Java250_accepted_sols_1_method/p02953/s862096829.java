import java.awt.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();

        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1])a[i+1]--;
            else if(a[i]==a[i+1]);
            else {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}