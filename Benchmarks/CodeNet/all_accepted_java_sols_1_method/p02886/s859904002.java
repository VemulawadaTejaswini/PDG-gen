import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("Main.out");

        int n = sc.nextInt();
        int[] tak = new int[n];
        for(int i = 0; i<n; i++){
            tak[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                sum+=tak[i]*tak[j];
            }
        }
        System.out.println(sum);

    }
}