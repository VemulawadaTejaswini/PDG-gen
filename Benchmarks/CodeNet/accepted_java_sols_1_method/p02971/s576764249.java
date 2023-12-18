import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        int ans[] = new int[n];



        int max1 = 0;
        int max2 = 0;

        for (int num: a){
            if (num>max1){
                max2 = max1;
                max1 = num;
            }else if (num>max2){
                max2 = num;
            }
        }

        for (int i=0; i<n; i++){
            if (a[i]==max1){
                ans[i] = max2;
            }else{
                ans[i] = max1;
            }
        }


        for (int i=0; i<n; i++)
        {
            System.out.println(ans[i]);
        }

    }
}
