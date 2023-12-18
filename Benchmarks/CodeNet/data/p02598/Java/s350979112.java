import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st  = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l=1,h=1000000000;
        while(l<h) {
            int mid = l+(h-l)/2;
            boolean res = check(mid,arr,k);
            if (res) {
                h=mid;
            }
            else
                l=mid+1;
        }
        if (check(l,arr,k)) {
            System.out.println(l);
        }
        else
            System.out.println("-1");


    }

    public static boolean check(int mid, int[] arr, int k) {
        for (int i=0; i<arr.length; i++) {
            if(arr[i]>mid){
                k-=arr[i]/mid;
                if (k<0) {
                    return false;
                }
            }
        }
        return true;
    }



}