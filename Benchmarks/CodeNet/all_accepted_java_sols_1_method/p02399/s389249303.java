import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String f = String.format("%.5f", ((double)a/(double)b));

        System.out.println((a/b)+" "+(a%b)+" "+f);

    }
}