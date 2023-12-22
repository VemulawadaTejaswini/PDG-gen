import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();

        int[] a = new int[4];
        for(int i = 0;i < 4; i++){
            a[i] = S % (int)Math.pow(10, 4 - i) / (int)Math.pow(10, 3 - i);
        }

        String x = "Good";
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] == a[i + 1]){
                x = "Bad";
            }
        }
        System.out.println(x);
    }
}
