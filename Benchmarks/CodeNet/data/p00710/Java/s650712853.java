import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n,r;
            n=sc.nextInt();
            r=sc.nextInt();
            if(n==0&&r==0)break;
            int x[]=new int[n];
            int y[]=new int[50];
            for(int i=0;i<n;i++){
                x[i]=n-i;
            }
            for(int i=0;i<r;i++){
                int a,b;
                a=sc.nextInt();
                b=sc.nextInt();
                --a;
                for(int j=a;j<a+b;j++){
                    y[j-a]=x[j];
                }
                for(int j=a-1;j>=0;j--){
                    x[j+b]=x[j];
                }
                for(int j=0;j<b;j++){
                        x[j]=y[j];
                }
            }
            System.out.println(x[0]);

        }
    }
}

