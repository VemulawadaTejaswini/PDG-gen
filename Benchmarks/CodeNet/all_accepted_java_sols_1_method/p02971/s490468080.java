import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }

        int[] left = new int[n];
        left[0] = a[0];
        for(int i=1; i<n; i++){
            if(left[i-1] < a[i]){
                left[i] = a[i];
            }else{
                left[i] = left[i-1];
            }
        }

        int[] right = new int[n];
        right[n-1] = a[n-1];
        for(int i=n-2; i>=0; i--){
            if(right[i+1] < a[i]){
                right[i] = a[i];
            }else{
                right[i] = right[i+1];
            }
        }

        for(int i=0; i<n; i++){
            if(i == 0){
                System.out.println(right[1]);
            }else if(i == n-1){
                System.out.println(left[n-2]);
            }else{
                if(left[i-1] < right[i+1]){
                    System.out.println(right[i+1]);
                }else{
                    System.out.println(left[i-1]);
                }
            }
        }
    }
}
