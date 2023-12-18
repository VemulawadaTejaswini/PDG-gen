import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] info = new int[15][10];
        for(int i=0; i<n; i++) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();

            // b 1: 1-3 2:5-7 3:9-12 4:13-15
            // b 1: 1=0+f-1 2:4+f-1 3:8+f-1 4:12+f-1
            switch(b) {
                case 1:
                    info[0+(f-1)][r-1] += v;
                    break;
                case 2:
                    info[4+(f-1)][r-1] += v;
                    break;
                case 3:
                    info[8+(f-1)][r-1] += v;
                    break;
                case 4:
                    info[12+(f-1)][r-1] += v;
                    break;
            }
        }

        for(int i=0; i<15; i++) {
            if(i == 3 || i == 7 || i == 11) {
                System.out.println("####################");
                continue;
            }
            for(int j=0; j<10; j++) {
                if(j == 9) {
                    System.out.println(" " + info[i][j]);
                } else {
                    System.out.print(" " + info[i][j]);
                }
            }
        }
    }
}

