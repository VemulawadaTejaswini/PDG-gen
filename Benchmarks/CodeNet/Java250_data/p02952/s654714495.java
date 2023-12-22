import java.awt.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[100001];

        a[0]=0;
        for(int i=1;i<a.length;i++){
            String s=i+"";
            int len=s.length();
            if((len&1)==1){
                a[i]=a[i-1]+1;
            }
            else a[i]=a[i-1];
        }
        int n=sc.nextInt();
        System.out.println(a[n]);
    }
}