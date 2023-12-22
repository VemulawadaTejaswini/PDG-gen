import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean b = true;
        b &= a[0][0] - a[1][0] == a[0][1] - a[1][1];
        b &=  a[0][2] - a[1][2] == a[0][1] - a[1][1];
        b &= a[2][0] - a[1][0] == a[2][1] - a[1][1];
        b &=  a[2][2] - a[1][2] == a[2][1] - a[1][1];
        b &= a[0][0] - a[0][1] == a[1][0] - a[1][1];
        b &= a[2][0] - a[2][1] == a[1][0] - a[1][1];
        b &= a[0][2] - a[0][1] == a[1][2] - a[1][1];
        b &= a[2][2] - a[2][1] == a[1][2] - a[1][1];
        System.out.println(b ? "Yes" : "No");
    }


}
