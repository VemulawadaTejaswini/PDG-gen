import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] rst = new int[50][3];

        for(int i=0; i<50; i++) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            rst[i][0] = m;
            rst[i][1] = f;
            rst[i][2] = r;
            if(m == -1 && f == -1 && r == -1) {
                break;
            }
        }

        for(int i=0; i<rst.length; i++) {
            if(rst[i][0] == -1 && rst[i][1] == -1 && rst[i][2] == -1) {
                break;
            } else if(rst[i][0] == -1 || rst[i][1] == -1) {
                System.out.println("F");
            } else if(rst[i][0] + rst[i][1] >= 30 && rst[i][0] + rst[i][1] < 50 && rst[i][2] >= 50) {
                System.out.println("C");
            } else if(rst[i][0] + rst[i][1] >= 80) {
                System.out.println("A");
            } else if(rst[i][0] + rst[i][1] >= 65 && rst[i][0] + rst[i][1] < 80 ) {
                System.out.println("B");
            } else if(rst[i][0] + rst[i][1] >= 50 && rst[i][0] + rst[i][1] < 65 ) {
                System.out.println("C");
            } else if(rst[i][0] + rst[i][1] >= 30 && rst[i][0] + rst[i][1] < 50 ) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}

