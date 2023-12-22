import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        for (int i = 0; i < 9; i++) c[i/3][i%3] = sc.nextInt();
        System.out.println(c[0][0]+c[1][1]==c[0][1]+c[1][0] && c[0][2]+c[2][0]==c[0][0]+c[2][2] && c[1][2]+c[2][1]==c[1][1]+c[2][2]? "Yes": "No");
    }
}