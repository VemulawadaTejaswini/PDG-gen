import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            double velocity = sc.nextDouble();
            double height = Math.pow((velocity / 2),2) / 4.9;
            System.out.println((int)(Math.ceil(height / 5) * 5 + 5) / 5);
        }
    }
}

