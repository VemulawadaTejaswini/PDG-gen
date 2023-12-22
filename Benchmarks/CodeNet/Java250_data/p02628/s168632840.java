import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        List<Integer> listN = new ArrayList<Integer>();

        for(int i = 0; i < N; i++){
            listN.add(scan.nextInt());
        }

        Collections.sort(listN);

        int sum = 0;

        for(int i = 0; i < K; i++){
            sum = sum + listN.get(i);
        }

        System.out.println(sum);

        scan.close();
    }
}