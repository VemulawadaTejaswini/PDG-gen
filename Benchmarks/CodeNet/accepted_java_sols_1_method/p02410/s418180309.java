import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]a=new int [100][100];
        int []b=new int [100];
        int c=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int q=sc.nextInt();
                a[i][j]=q;
                
            }
        }
        
        for(int i=0;i<m;i++){
            int r=sc.nextInt();
            b[i]=r;
        }
        
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c+=a[i][j]*b[j];
            }
            System.out.println(c);
            c=0;
        }
    }
}

