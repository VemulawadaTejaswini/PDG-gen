


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int one = input.nextInt();
        int two = input.nextInt();
        int divide = one / two;
        int mod = one % two;
        double divideD = (double) one/ (two * 1.0);
        System.out.printf("%d %d %.5f",divide, mod, divideD);
    }
}
