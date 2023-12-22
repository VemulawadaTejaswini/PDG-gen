import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] h = new Integer[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int result = 0;
        int count = 0;
        for (int i = 1; i < n; i++){
            if (h[i-1] >= h[i]){
                count++;
                result = Math.max(result, count);
            } else{
                result = Math.max(result, count);
                count = 0;
            }
        }

        System.out.println(result);
    }
}
