import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){

       Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int[] a = new int[n];

       int ans = 0;
       a[0] = stdIn.nextInt();

        for(int i = 1;i < n;i++){
            a[i] = stdIn.nextInt();

            if(a[i - 1] == a[i]){
                   a[i] = -1;
                   ans++;

            }

        }
        System.out.println(ans);

    }
}
