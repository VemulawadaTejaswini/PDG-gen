import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        scan.close();
        if (x == 3 || x == 5 || x == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}