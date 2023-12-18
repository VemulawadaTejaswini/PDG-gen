import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long k=sc.nextLong();
        long[] arr=new long[n];
        long[] arr1=new long[m];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextLong();
        for(int i=0;i<m;i++)
        arr1[i]=sc.nextLong();
        int count=0;
        int i=0,j=0;
        while(i<n && j<m && k>=0){
            if(arr[i]<=arr1[j]){
                k-=arr[i];
                if(k>=0){
                    count++;
                }
                
                i++;
            }
            else{
                k-=arr1[j];
                if(k>=0){
                    count++;
                }
                j++;
            }
        }
        if(j!=m-1 && k>0){
            while(j<m && k>=0){
                k-=arr1[j];
                if(k>=0){
                    count++;
                }
                j++;
            }
        }
        else if( i!=n-1 && k>0 ){
            System.out.println("hello");
            while(i<n && k>=0){
                k-=arr[i];
                if(k>=0){
                    count++;
                }
                i++;
            }
        }
        System.out.println(count);
    }

}
               
