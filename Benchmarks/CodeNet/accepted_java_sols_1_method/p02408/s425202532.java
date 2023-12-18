import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int S[]=new int[13];
        int H[]=new int[13];
        int C[]=new int[13];
        int D[]=new int[13];
        for(int i=0;i<n;i++){
            String M=sc.next();
            int number=sc.nextInt();
            if(M.equals("S")) S[number-1]=number;
            else if(M.equals("H")) H[number-1]=number;
            else if(M.equals("C")) C[number-1]=number;
            else D[number-1]=number;
            
        }
        for(int i=0;i<13;i++){
            if(S[i]==0)System.out.printf("S %d\n",i+1);
        }
        for(int i=0;i<13;i++){
            if(H[i]==0)System.out.printf("H %d\n",i+1);
        }
        for(int i=0;i<13;i++){
            if(C[i]==0)System.out.printf("C %d\n",i+1);
        }
        for(int i=0;i<13;i++){
            if(D[i]==0)System.out.printf("D %d\n",i+1);
        }
    }
}
