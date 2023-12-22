import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i= 1;i<Integer.MAX_VALUE;i++) {
            int min = (int)Math.pow(k, i-1);
            int max = (int)Math.pow(k, i);
            if (min <= n && n < max) {
                System.out.println(i);
                return;
            }
        }
    }
}