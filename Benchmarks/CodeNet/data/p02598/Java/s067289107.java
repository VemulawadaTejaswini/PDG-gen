import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }

        int l = 1;
        int r = 0;
        for(int i=0; i<n; i++){
            if(a[i] > r)
                r = a[i];
        }


        while(l < r){
            int x = (l + r) / 2;
            if(isAbleToCut(a, x, k)){
                r = x;
            }else{
                l = x+1;
            }
        }

        System.out.println(l);
    }

    static boolean isAbleToCut(int[] a, int x, int k){
        int n = a.length;
        int cnt = 0;
        for(int i=0; i<n; i++){
            cnt += ((int)Math.ceil((double)a[i] / x)) - 1;
        }
        return cnt <= k;
    }
}