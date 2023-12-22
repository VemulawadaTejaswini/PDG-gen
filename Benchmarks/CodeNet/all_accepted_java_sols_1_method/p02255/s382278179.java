import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            int j = i;

            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
            // System.out.println(Arrays.toString(arr));
            for (int k = 0; k < arr.length; k++) {
                if(k != 0){System.out.print(" ");}
                System.out.print(arr[k]);
                
            }
            System.out.println();
        }
    }
}
