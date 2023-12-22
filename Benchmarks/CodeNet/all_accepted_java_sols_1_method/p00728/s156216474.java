import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;
            int i;
            int ave=0;
            int score[] = new int[n];
            for(i=0;i<n;i++){
                score[i] = sc.nextInt();
            }
            Arrays.sort(score);
            for(i=1;i<n-1;i++){
                ave += score[i];
            }
            ave /= n-2;
            System.out.println(ave);
        }
    }
}

