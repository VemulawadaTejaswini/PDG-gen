import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] sp = s.split(" ");
        int[] arr = new int[N];
        for(int i = 0; i<N; i++) arr[i] = Integer.parseInt(sp[i]);

        int left = -1;
        int right = -1;
        boolean possible = false;
        for(int i = 1; i<N; i++){
            int sum = arr[i] + arr[i-1];
            if(sum >= L){
                possible = true;
                left = i-1;
                right = i;
                break;
            }
        }
        if(!possible){
            System.out.println("Impossible");
        }
        else{
            System.out.println("Possible");
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i<=left; i++){
                sb.append(i);
                sb.append("\n");
            }
            for(int i = N-1; i>=right+1; i--){
                sb.append(i);
                sb.append("\n");
            }
            sb.append(right);
            System.out.println(sb);
        }
    }
}