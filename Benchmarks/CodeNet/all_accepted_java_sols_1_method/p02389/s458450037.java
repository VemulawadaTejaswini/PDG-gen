import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    int j = scan.nextInt();
    scan.close();

    System.out.print(i*j);
    System.out.print(" ");
    System.out.println((i+j)*2);
}

}