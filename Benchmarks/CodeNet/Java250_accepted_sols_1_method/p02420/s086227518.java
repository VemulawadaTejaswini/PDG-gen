import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = scan.nextLine();
            if (str.equals("-")) {
                break;
            }
            int a = scan.nextInt();
            for (int i = 0;i < a; i++) {
                int h = scan.nextInt();
                str = str.substring(h,str.length()) + str.substring(0, h);
            }
            System.out.println(str);
            str = scan.nextLine();
        }
    }
}