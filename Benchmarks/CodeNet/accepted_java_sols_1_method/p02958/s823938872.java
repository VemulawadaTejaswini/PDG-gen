import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] sorted = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            p[i]= scanner.nextInt();
            sorted[i]= p[i];
        }
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            if(p[i] != sorted[i]){
                count++;
            }
        }
        if(count <= 2){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }

}

