import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][]a = new String[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] = sc.next();
            }
        }
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String b = sc.next();
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    if(b.equals(a[j][k])) {
                        a[j][k] = "0";
                    }
                }
            }
        }
        for(int i=0; i<3; i++) {
            if(a[i][0].equals("0") && a[i][1].equals("0") && a[i][2].equals("0")) {
                System.out.println("Yes");
                return;
            }
            if(a[0][i].equals("0") && a[1][i].equals("0") && a[2][i].equals("0")) {
                System.out.println("Yes");
                return;
            }
        }
        if(a[0][0].equals("0") && a[1][1].equals("0") && a[2][2].equals("0")) {
            System.out.println("Yes");
            return;
        }
        if(a[0][2].equals("0") && a[1][1].equals("0") && a[2][0].equals("0")) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}