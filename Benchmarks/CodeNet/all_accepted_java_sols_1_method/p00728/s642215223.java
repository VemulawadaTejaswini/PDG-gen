import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                if(n==0){break;}
                int[] scores = new int[n];
                for(int i=0; i<n; i++){
                    int s = sc.nextInt();
                    scores[i] = s;
                }
                Arrays.sort(scores);
                int ave=0;
                for(int i=1; i<n-1; i++){
                    ave+=scores[i];
                }
                ave/=(n-2);
                System.out.println(ave);
            }
        }
    }
}
