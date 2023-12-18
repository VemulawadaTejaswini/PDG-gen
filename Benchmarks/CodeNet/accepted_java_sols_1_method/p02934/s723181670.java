import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ns = sc.nextLine();
        int n = Integer.parseInt(ns);
        
        String inputs = sc.nextLine();
        String[] input = inputs.split(" ");
        
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += 1 / Double.parseDouble(input[i]);
        }
        
        System.out.println(1 / sum);
    }
}