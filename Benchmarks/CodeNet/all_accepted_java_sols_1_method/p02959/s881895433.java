import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n+1];
        int B[]=new int[n];
        for (int i=0;i<n+1;i++){
            A[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            B[i]=sc.nextInt();
        }
        long tot=0;
        for (int i=0;i<n;i++){
            if (B[i]>A[i]){
                B[i]-=A[i];
                tot+=A[i];
                if (B[i]>A[i+1]){
                    tot+=A[i+1];
                    A[i+1]=0;
                }else {
                    tot+=B[i];
                    A[i+1]-=B[i];
                }
            }else {
                tot+=B[i];
            }
        }
        System.out.println(tot);


    }

}

