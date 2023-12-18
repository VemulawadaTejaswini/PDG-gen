import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int s = Integer.parseInt(scanner.next());

        if(n < 10 && s < 10){
            System.out.println(n * s);
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }



}