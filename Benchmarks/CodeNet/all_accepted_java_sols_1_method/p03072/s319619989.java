import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] hArray = new int[N];
        for(int i = 0; i < N; i++){

            hArray[i] = scan.nextInt();
        }

        int ans = 1;
        int count =0;
        for(int i = 0; i < N; i++) {

            count = 0;

            for (int j = 0; j < i; j++){

                if(hArray[i] >= hArray[j]){
                    count++;
                    if(count == i) ans++;
                }
            }

        }

        System.out.println(ans);
    }
}