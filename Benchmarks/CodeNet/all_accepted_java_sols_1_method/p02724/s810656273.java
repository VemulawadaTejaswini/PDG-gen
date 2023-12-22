import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int a = input/500;
        int b = (input%500)/5;


        System.out.println(a*1000 + b*5);
        scanner.close();
    }

}
