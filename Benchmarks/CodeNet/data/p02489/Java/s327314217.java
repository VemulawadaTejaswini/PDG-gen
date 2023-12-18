import java.util.Scanner;

class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                for(int i = 1;num != 0;i++) {
                        System.out.println("Case i: " + num);
                        num = scan.nextInt();
                }
        }
}