import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0) break;
            int max=0,min=1000,sum=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                sum+=a;
                if(a>max) max=a;
                if(a<min) min=a;
            }
            sum=sum-max-min;
            System.out.println(sum/(n-2));
        }
    }
}
