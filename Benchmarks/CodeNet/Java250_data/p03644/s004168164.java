import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        System.out.println(0b1 << Integer.toBinaryString(N).length() - 1);
    }
}
