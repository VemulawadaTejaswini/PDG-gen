import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] players = new int[n];
        Arrays.fill(players,k-q);
        //System.out.println(k-q);

        for(int i=0;i<q;i++){
            int temp = sc.nextInt();
            players[temp-1] = players[temp-1] + 1;
        }

        for(int i=0; i<n; i++){
            if(players[i] >0){

                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }



    }
}