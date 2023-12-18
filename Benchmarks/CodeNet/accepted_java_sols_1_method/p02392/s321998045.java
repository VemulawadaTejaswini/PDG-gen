import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String com;
        if (a<b && b<c) {
            com = "Yes";
        } else {
            com = "No";
        }

        System.out.println(com);
    }

}
