import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] a = new int[4][13];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                a[i][j] = j + 1;
            }
        }
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i = 0; i < b; i++) {
            String c = sc.next();
            int d = sc.nextInt();
            int e = 0;
            switch(c) {
            case "S":
                e = 0;
                break;
            case "H":
                e = 1;
                break;
            case "C":
                e = 2;
                break;
            case "D":
                e = 3;
                break;
            default:
                break;
            }
            a[e][d - 1] = 0;
        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                if(a[i][j] != 0) {
                    String s = "";
                    switch(i) {
                    case 0:
                        s = "S";
                        break;
                    case 1:
                        s = "H";
                        break;
                    case 2:
                        s = "C";
                        break;
                    case 3:
                        s = "D";
                        break;
                    default:
                        break;
                    }
                    System.out.println(s + " " + a[i][j]);
                }
            }
        }
    }
}
