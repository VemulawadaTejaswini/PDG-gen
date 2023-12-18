import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            if (h == 0 && w == 0) break;
            StringBuilder outW = new StringBuilder();
            StringBuilder outUD = new StringBuilder();
            for(int a = 0; a < w; a++){
                outUD.append("#");
                if (a == 0 || a == w-1) {
                    outW.append("#");
                } else {
                    outW.append(".");
                }
            }
            for(int b = 0; b < h; b++) {
                if (b == 0 || b == h-1) {
                    System.out.println(outUD);
                } else {
                    System.out.println(outW);
                }
            }
            System.out.println("");
        }
    }
}

