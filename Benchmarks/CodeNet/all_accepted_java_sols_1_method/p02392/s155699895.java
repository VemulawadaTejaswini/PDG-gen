import java.util.Scanner;

class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String hoge;
        if (a < b && b < c) {
        	hoge = "Yes";
        }
        else {
        	hoge = "No";
        }
        System.out.println(hoge);
	}

}

