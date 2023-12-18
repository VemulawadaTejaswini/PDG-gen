import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); 
        int[][] a = new int[4][13];
        for (int k = 0; k < n; k++) {
            String suit = sc.next();
            int rank = Integer.parseInt(sc.next());
            switch (suit) {
                case "S" :
                    a[0][rank-1] = 1;
                    break;
                case "H" :
                    a[1][rank-1] = 1;
                    break;
                case "C" :
                    a[2][rank-1] = 1;
                    break;
                case "D" :
                    a[3][rank-1] = 1;
                    break;
                default :
                    break;
            }
        } 
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 13; j++)
                if (a[i][j] == 0)
                    switch  (i) {
                        case 0 :
                            System.out.print("S ");
                            System.out.println(j+1);
                            break;
                        case 1 :
                            System.out.print("H ");
                            System.out.println(j+1);
                            break; 
                        case 2 :
                            System.out.print("C ");
                            System.out.println(j+1);
                            break;
                        case 3 :
                            System.out.print("D ");
                            System.out.println(j+1);
                            break;
                        default :
                            break;
                    }
    }
}
