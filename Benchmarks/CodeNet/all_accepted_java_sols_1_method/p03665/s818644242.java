import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        boolean even=false,odd=false;
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)even=true;
            if(a[i]%2!=0)odd=true;
        } 
        if(odd){
            System.out.println(1L<<n-1);
        }
        else if((even&&p==0)){
            System.out.println(1L<<n);
        }
        else if(even&&p==1){
            System.out.println(0);
        }
    }
}