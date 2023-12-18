import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            if (h == 0 && w == 0) break;
            StringBuilder outW = new StringBuilder();
            for(int a = 0; a < w; a++){
                outW.append("#");
            }
            for(int a = 0; a < h; a++) {
                System.out.println(outW);
            }
            System.out.println("");
        }
    }
}

