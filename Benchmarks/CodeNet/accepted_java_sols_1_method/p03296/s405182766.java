import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i < n;++i){
            arr[i] = scanner.nextInt();
        }
        int c = 0;
        for (int i = 1;i < n;++i){
            if(arr[i - 1] == arr[i]){
                if(i + 1 == n){
                    ++c;
                }
                else{
                    arr[i] = 10001;
                    ++c;
                }
            }
        }
        System.out.println(c);
    }
}
