import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int  max,min;
       long sum;
       sum=0;
       max=-1000000;
       min=1000000;
       for(int i=1;i<=n;i++){
           int a=sc.nextInt();
           sum+=a;
           if(max<a)max=a;
           if(min>a)min=a;
       }
        System.out.println(min+" "+max+" "+sum); 
      
    }
}

