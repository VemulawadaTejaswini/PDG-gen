import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int year = 0;
        long money = 100;
        while (money<x){
            year++;
            money +=money/100;
        }
        System.out.println(year);
    }
}
