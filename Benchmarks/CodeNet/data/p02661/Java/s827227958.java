
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[][] ab = new int[N][2];
        for(int i=0;i<N;i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
        if(N%2 == 1){
            int med_min = ab[0][0];
            int med_max = ab[0][1];
            for(int i=1;i<N;i+=2){
                if(ab[i][0] >= ab[i+1][0]){
                    med_min = Math.max(Math.min(ab[i][0], med_min), ab[i+1][0]);
                }else{
                    med_min = Math.max(Math.min(ab[i+1][0], med_min), ab[i][0]);
                }
                if(ab[i][1] >= ab[i+1][1]){
                    med_max = Math.max(Math.min(ab[i][1], med_max), ab[i+1][1]);
                }else{
                    med_max = Math.max(Math.min(ab[i+1][1], med_max), ab[i][1]);
                }
            }
            System.out.println(med_max - med_min + 1);
        }else{
            System.out.println("わかりませんでした");
        }
    }
}
