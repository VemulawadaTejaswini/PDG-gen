import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[3];
        for (int i=0;i<3;i++)
            n[i]=sc.nextInt();
        for (int i=1;i>=0;i--){
            for (int j=0;j<=i;j++){
                if (n[j]>=n[j+1]){
                    int boo=n[j];
                    n[j]=n[j+1];
                    n[j+1]=boo;
                }
            }
        }
        for (int i=0;i<3;i++)
            System.out.print(n[i]+" ");
    }
}