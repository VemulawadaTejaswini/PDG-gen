import java.util.Scanner;

    class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a * b * c == 175)
        System.out.print("YES");

        else

        System.out.print("NO");


        scan.close();
	}

}