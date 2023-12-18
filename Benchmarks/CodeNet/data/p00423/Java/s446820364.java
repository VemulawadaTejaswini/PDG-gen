import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i > 0){
            int pointA = 0;
            int pointB = 0;
            for (int j = 0; j < i; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b){
                    pointA += a + b;
                }
                else if (a < b){
                    pointB += a + b;
                }
                else {
                    pointA += a;
                    pointB += b;
                }
            }
            System.out.println(pointA + " " + pointB);
            i = sc.nextInt();
        }
    }
}

