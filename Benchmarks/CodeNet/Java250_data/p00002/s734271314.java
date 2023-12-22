import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        while(sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            int sum = Integer.parseInt(line[0]) + Integer.parseInt(line[1]);
            System.out.println(String.valueOf(sum).length());
        }
    }
}