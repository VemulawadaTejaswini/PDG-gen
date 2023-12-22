import java.util.Scanner;

class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        String[] ints = sc.nextLine().split(" ");
        System.out.println(ints[2] + " " + ints[0] +" " + ints[1]);
    }
}