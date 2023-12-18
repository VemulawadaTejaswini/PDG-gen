import java.util.Scanner;

class At_Coder_01 {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a = N % 10;

        if (a == 2 || a == 4 || a == 5 || a == 7 || a == 9) {
            System.out.println("hon");
        }
        else if (a == 0 || a == 1 || a == 6 || a == 8) {
            System.out.println("pon");
        }
        else {
            System.out.println("bon");
        }


    }
}