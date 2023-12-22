import java.util.Scanner;
class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, d, r;
        a = sc.nextInt();
        b = sc.nextInt();
        d = a / b;
        r = a % b;
        System.out.printf(d + " " + r + " %.5f", (double) a / b);
    }
}