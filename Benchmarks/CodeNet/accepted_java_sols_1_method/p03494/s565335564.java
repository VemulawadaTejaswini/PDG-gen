import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int [] arr = new int[n];
        boolean sol = true;
        int sum = 0;
        for (int i = 0; i< n; i++){
            arr[i] = in.nextInt();
            if (arr[i] % 2 != 0){
                sol = false;
            }
        }
        while(sol){
            for (int i = 0; i < n; i++){
                if (arr[i] % 2 == 0){
                    arr[i] = arr[i] /2;
                }
                else{
                    System.out.println(sum);
                    return;
                }
            }
            sum++;
        }
        System.out.println(sum);
    }
}