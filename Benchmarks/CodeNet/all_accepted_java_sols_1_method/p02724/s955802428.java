import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long haveMoney = sc.nextLong();
        long pleasure = 0;
        while(500 <= haveMoney){
            haveMoney -= 500;
            pleasure += 1000;
        }
        while(5 <= haveMoney){
            haveMoney -= 5;
            pleasure += 5;
        }
        System.out.println(pleasure);
    }
}