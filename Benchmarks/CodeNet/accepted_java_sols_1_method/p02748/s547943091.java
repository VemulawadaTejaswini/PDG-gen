import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numM = sc.nextInt();
        int min;
        int minA = 0;
        int minB = 0;
        int a[] = new int[numA];
        int b[] = new int[numB];
        int m [][] = new int[numM][3];
        for (int i = 0; i < numA; i++){
            a[i] = sc.nextInt();
            if (i == 0){
                minA = a[i];
            }
            if (minA > a[i]){
                minA = a[i];
            }
        }
        for (int i = 0; i < numB; i++){
            b[i] = sc.nextInt();
            if (i == 0){
                minB = b[i];
            }
            if (minB > b[i]){
                minB = b[i];
            }
        }
        min = minA + minB;
        for (int i = 0; i < numM; i++){
         for (int j = 0; j < 3; j++){
             m[i][j] = sc.nextInt();
         }
            if (min > a[m[i][0] - 1] + b[m[i][1] - 1] - m[i][2]){
                min = a[m[i][0] - 1] + b[m[i][1] - 1] - m[i][2];
            }
        }
        System.out.println(min);
    }
}
