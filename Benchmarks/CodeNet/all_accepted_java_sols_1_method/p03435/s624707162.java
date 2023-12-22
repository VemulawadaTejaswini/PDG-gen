import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<=100; i++) {
            for(int j = 0; j<=100; j++) {
                for(int k = 0; k<=100; k++) {
                    if(a[0][0]-i ==  a[1][0] - j && a[1][0]-j ==  a[2][0] - k && a[2][0]-k ==  a[0][0] - i) {
                        if(a[0][1]-i ==  a[1][1] - j && a[1][1]-j ==  a[2][1] - k && a[2][1]-k ==  a[0][1] - i) {
                            if(a[0][2]-i ==  a[1][2] - j && a[1][2]-j ==  a[2][2] - k && a[2][2]-k ==  a[0][2] - i) {
                                System.out.println("Yes");
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No");

    }
}