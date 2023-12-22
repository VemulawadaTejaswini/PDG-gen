import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[100][100];
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        for(int j=0;j<n;j++){
            for(int k=0;k<m;k++){
                a[j][k]=sc.nextInt();
            }
        }
        int b[][]=new int[100][100];
        for(int j=0;j<m;j++){
            for(int k=0;k<l;k++){
                b[j][k]=sc.nextInt();
            }
        }
        long c[][]=new long[100][100];
        for(int j=0;j<n;j++){
            for(int k=0;k<l;k++){
                for(int i=0;i<m;i++){
                    c[j][k]+=a[j][i]*b[i][k];
                }
                System.out.print(c[j][k]);
                if(k!=l-1)System.out.print(" ");
            }
            System.out.println();
        }
    }
}
