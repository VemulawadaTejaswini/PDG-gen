import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num  < min){
                counter++;
                min = num;
            }
        }
        System.out.println(counter);
    }
}