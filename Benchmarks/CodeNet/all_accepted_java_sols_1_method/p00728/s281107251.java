import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }

            int scores[] = new int[n];
            int i;
            for(i=0; i<n; i++){
                scores[i] = sc.nextInt();
            }

            Arrays.sort(scores);

            int j, sum = 0;
            for(j=1; j<n-1; j++){
                sum += scores[j];
            }

            System.out.println(sum / (n - 2));

        }

        sc.close();

    }
}
