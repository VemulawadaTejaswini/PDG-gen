import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        int S=0; 
        int ans=0;
	    for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
            S^=a[i];
        }
        for(int i=0; i<N; i++){
            b[i]=S^a[i];
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}
