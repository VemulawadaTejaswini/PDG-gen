
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
//            sum+=arr[i];
        }
        int q = s.nextInt();
        for(int i = 0;i<q;i++){
            long sum = 0;
            int t = s.nextInt();
            int k =s.nextInt();
            for(int j = 0;j<n;j++){
                if(arr[j]==t){
                    arr[j] = k;
                }
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
