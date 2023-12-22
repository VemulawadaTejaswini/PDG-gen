import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=ob.nextInt();
        }
        int arr[]=new int[n];
        arr[0]=0;
        arr[1]=Math.abs(a[1]-a[0]);
        for(int i=2;i<n;i++){
            arr[i]=Math.min(arr[i-2]+Math.abs(a[i]-a[i-2]),arr[i-1]+Math.abs(a[i]-a[i-1]));
        }
        System.out.println(arr[n-1]);
        ob.close();
    }
}