import java.util.Scanner;

class Main {
    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i] = in.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>brr[i])
                max+= arr[i]-brr[i];
        }
        System.out.println(max);

    }
}