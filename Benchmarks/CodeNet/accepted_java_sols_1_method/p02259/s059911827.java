import java.util.*;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++){
           a[i] = sc.nextInt();
       }
       int count = 0;
       boolean flag = true;
       while(flag){
           flag = false;
           for(int i=n-1;i>0;i--){
               if(a[i]<a[i-1]){
                   int tmp = a[i];
                   a[i] = a[i-1];
                   a[i-1] = tmp;
                   count++;
                   flag = true;
               }
           }
       }
       System.out.print(a[0]);
       for(int i=1;i<n;i++){
           System.out.printf(" %d",a[i]);
       }
       System.out.println();
       System.out.println(count);
    }
}

