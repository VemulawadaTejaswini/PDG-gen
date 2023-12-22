import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array= new int[n];

        for(int i= 0; i < n;i++){
            array[i] = scan.nextInt();
        }

        int ans = 0;
        for(int i= 0; i <= n-3 ;i++){

            if( array[i] < array[i+1] && array[i+1] < array[i+2]){

                ans++;

            }else if(array[i] > array[i+1] && array[i+1] > array[i+2]) {

                ans++;
            }
        }

        System.out.println(ans);




        return;

    }
}