import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(Math.pow(x, 2.0) + Math.pow(y, 2.0) <= Math.pow(d, 2)){
                count++;
            }
        }
        System.out.println(count);
    }
}