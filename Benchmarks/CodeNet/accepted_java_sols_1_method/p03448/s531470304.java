import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++){
            for (int j = 0; j <= b; j++){
                for (int l = 0; l <= c; l++){
                    if (i*500 + j*100 + l*50 == x){
                        sum++;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}