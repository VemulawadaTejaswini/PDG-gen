import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        double result = 100000;
        double debt = check(week, result);
        System.out.println((int)debt);
    }

    public static double check(int week, double result){
        if(week == 0)
            return result;
        else
            return check(--week, Math.ceil(result * 1.05 / 1000) * 1000);
        }
    }

