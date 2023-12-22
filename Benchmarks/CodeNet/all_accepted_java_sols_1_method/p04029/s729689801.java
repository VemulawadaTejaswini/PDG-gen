import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int candies = (N * (N + 1))/2;
        System.out.println (candies);
    }
}