import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m=sc.nextInt();
        int a=sc.nextInt();
        int n[]=new int[m];
        for(int i=0;i<m;i++)
            n[i]=sc.nextInt();
        Arrays.sort(n);
        long all=0;
        for(int i=0;i<m-a;i++)
            all+=n[i];
        System.out.println(all);
    }
}