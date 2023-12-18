import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();

        int n = sc.nextInt();

        int[][] B = new int[4][13];
        for (int i=0; i<4; i++) {
            Arrays.fill(B[i], 0);
        }

        for (int i=0; i<n; i++) {
            String TM = sc.next();
            int TN = sc.nextInt();
            switch (TM) {
                case "S":  {
                    B[0][TN-1] = 1;
                    break;
                }
                case "H": {
                    B[1][TN-1] = 1;
                    break;
                }
                case "C": {
                    B[2][TN-1] = 1;
                    break;
                }
                case "D": {
                    B[3][TN-1] = 1;
                    break;
                }
            }
        }

        for (int i=0; i<4; i++) {
            for (int j=0; j<13; j++) {
                if (B[i][j] == 0) {
                    switch (i) {
                        case 0: {
                            System.out.printf("S %d\n", j+1);
                            break;
                        }
                        case 1: {
                            System.out.printf("H %d\n", j+1);
                            break;
                        }
                        case 2: {
                            System.out.printf("C %d\n", j+1);
                            break;
                        }
                        case 3: {
                            System.out.printf("D %d\n", j+1);
                            break;
                        }
                    }

                }
            }
        }




    }
}
