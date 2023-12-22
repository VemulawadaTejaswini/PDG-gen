import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[][] cards = new boolean[4][13];
        for(int i = 0; i < n; i++){
            String a = scanner.next();
            int b = scanner.nextInt();
            switch(a) {
                case "S": cards[0][b-1] = true; break;
                case "H": cards[1][b-1] = true; break;
                case "C": cards[2][b-1] = true; break;
                case "D": cards[3][b-1] = true; break;
            }
        }
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 13; k++) {
                if (j == 0 && cards[j][k]==false) {
                    System.out.println("S " + (k+1));
                } else if (j == 1 && cards[j][k]==false) {
                    System.out.println("H " + (k+1));
                } else if (j == 2 && cards[j][k]==false) {
                    System.out.println("C " + (k+1));
                } else if (j == 3 && cards[j][k]==false) {
                    System.out.println("D " + (k+1));
                }
            }
        }
    }
}

