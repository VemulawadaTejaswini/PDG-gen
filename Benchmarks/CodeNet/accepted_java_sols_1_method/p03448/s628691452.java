import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= 50; i++) {
            for (int j = 0; j <= 50; j++) {
                for(int k = 0; k <= 50; k++){
                    if (500*i + 100*j + 50*k == x && i <= a && j <= b && k <= c) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
