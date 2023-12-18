import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr = new int[N];
        long sum=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.printf("%d %d %d\n",arr[0],arr[N-1],sum);
    }     
}
