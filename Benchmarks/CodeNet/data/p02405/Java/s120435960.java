import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            if (h == 0 && w == 0) break;
            for (int b = 1; b <= h; b++) {
                StringBuilder out = new StringBuilder();
                //偶数の行
                if (b % 2 == 0) {
                    for (int a = 1; a <= w; a++){
                        //偶数の列には#を追加
                        if (a % 2 == 0) {
                            out.append("#");
                        } else {
                            out.append(".");
                        }
                    }
                } else {
                    for (int c = 1; c <= w; c++){
                        if (c % 2 == 0) {
                            out.append(".");
                        } else {
                            out.append("#");
                        }
                    }
                }
                System.out.println(out);
            }
            System.out.println("");
        }
    }
}

