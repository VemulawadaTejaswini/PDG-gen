import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long num, x, sum=0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLong();
        x = scanner.nextLong();
        //scanner.nextLine();
        for(int i=0; i<x; i++) sum += scanner.nextLong();
        if(sum > num){
            System.out.println(-1);
        }
        else System.out.println(num - sum);
    }
}