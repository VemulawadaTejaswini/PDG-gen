import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dam[] = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++){
            dam[i] = sc.nextInt();
            sum += dam[i];
        }


        int mt[] = new int[n];

        for (int i=0; i<n; i++){
            if (i%2==0){
                mt[0] += dam[i];
            }else{
                mt[0] -= dam[i];
            }
        }

        for (int i=0; i<n-1; i++){
            mt[i+1] = dam[i]*2 - mt[i];
        }

        for (int i=0; i<n; i++){
            System.out.print(mt[i]+" ");
        }
    }
}
