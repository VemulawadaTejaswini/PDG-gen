import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        //System.out.println(n);
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }


        Arrays.sort(arr);
        int m = 0;
        m = in.nextInt();
        //System.out.println(m);
        int[] brr = new int[m];
        for(int i = 0; i<m; i++){
            brr[i] = in.nextInt();
        }
        int res = 0;
        //System.out.println("n"+n+" "+arr[0]);
        //System.out.println(res);
        for(int i = 0; i<m; i++){
            if(search(arr,brr[i],0,n-1)==1) res++;
            //System.out.println(search(arr,brr[i],0,n-1));
        }
        System.out.println(res);
    }

    private static int search(int[] arr, int i,int left, int right) {
        //System.out.println("i:"+i);
        if(right<left) return -1;
        int mid = (left+right)/2;
        //System.out.println(arr[mid]+" "+mid);
        if(arr[mid] == i) return 1;
        if(arr[mid]>i){
            return search(arr,i,left,mid-1);
        }else {
            return search(arr,i,mid+1,right);
        }

    }
}

