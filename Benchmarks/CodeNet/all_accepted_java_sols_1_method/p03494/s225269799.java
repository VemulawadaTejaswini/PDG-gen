import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        int A[] = new int[n];
        int temp = 0 ;
        for (int i = 0;i<n ;i++){
            temp = sc.nextInt();
            int able = 0;
            while (temp%2 == 0){
                temp /= 2;
                able++;

            }
            A[i] = able;

        }
        ans = A[0];
        for(int i = 0 ;i<n ;i++){
            if(ans >=A[i]){
                ans = A[i];
            }
        }


        System.out.println(ans);
    }


}
