import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
       n= sc.nextInt();
       int [] a=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       int count=0;
       for(int i=0;i<n-1;i++){
           int m=a[i];
           int comp=1000000;
           int minj=0;
           for(int j=i+1;j<n;j++){
                if(comp>a[j]){
                    minj=j;
                    comp=a[j];
                }
           }
           if(m>comp){
            int tmp=a[i];
            a[i]=a[minj];
            a[minj]=tmp;
            count++;
        }
       }

       for(int i=0;i<n;i++){
        if(i!=(n-1))System.out.print(a[i]+" ");
        else  System.out.println(a[i]);
       }
       System.out.println(count);
}
}


