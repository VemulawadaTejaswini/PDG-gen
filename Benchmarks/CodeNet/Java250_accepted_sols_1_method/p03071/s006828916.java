import java.util.Scanner;
public class Main {
    public static void main(String[] args) {        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int botton = sc.nextInt();
        int botton2 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= 1; i++) {
            if (botton > botton2) {
                sum += botton;
                botton--;
            } else {
                sum += botton2;
                botton2--;
            }
        }
        System.out.println(sum);
    }

}
