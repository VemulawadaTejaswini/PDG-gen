import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = Integer.parseInt(stdIn.next());
        int b = Integer.parseInt(stdIn.next());

        int pl = 0;
        int pr = 1250;
        do {
            int pc = (pl + pr) / 2;
            if ((int)(pc * 0.08) == a && (int)(pc * 0.1) == b) {
                while ((int)(pc * 0.08) == a && (int)(pc * 0.1) == b) {
                    pc--;
                }
                pc++;
                System.out.println(pc);
                return;
            } else if ((int)(pc * 0.08) < a || (int)(pc * 0.1) < b) {
                pl = pc + 1;
            } else if ((int)(pc * 0.08) > a || (int)(pc * 0.1) > b) {
                pr = pc - 1;
            }
        } while (pl <= pr);

        System.out.println(-1);
    }
}
