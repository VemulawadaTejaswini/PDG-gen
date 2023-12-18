import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();

        long bb = (long)(b * 100 + 0.1);
        long ans = a * bb;

        System.out.println(ans / 100);
    }
}

