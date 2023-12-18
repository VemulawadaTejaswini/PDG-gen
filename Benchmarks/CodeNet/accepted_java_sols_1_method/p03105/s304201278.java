import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();


        int numCount = 0;
        for (int n = 0; n <= numC; n++) {
            while (numCount < numC) {
                if (numB / numA != 0) {
                    numB = numB - numA;
                    numCount = numCount + 1;
                }
                break;
            }
        }
        System.out.println(numCount);
    }
}