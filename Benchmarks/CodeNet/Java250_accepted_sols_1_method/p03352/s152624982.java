import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int g = 0;
        for (int b = 1; b <= 33; b++) {
            for (int p = 2; p <= 10; p++) {
                if ((int)Math.pow(b,p) > x) {
                    break;
                } else if ((int)Math.pow(b,p) > g){
                    g = (int)Math.pow(b,p);
                }
            }
        }
        System.out.print(g);
        sc.close();
    }
}