import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cifra = in.nextInt();
        int cantidad = cifra*cifra*cifra;
        System.out.println(cantidad);
    }
}