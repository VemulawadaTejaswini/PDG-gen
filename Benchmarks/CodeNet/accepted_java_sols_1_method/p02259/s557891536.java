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
           for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    count++;
                }
           }
       }

       for(int i=0;i<n;i++){
        if(i!=(n-1))System.out.print(a[i]+" ");
        else  System.out.println(a[i]);
       }
       System.out.println(count);
}
}


