import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        int[][] c = new int[4][4];
        for(int row=1;row<=3;row++){
            for(int col=1;col<=3;col++){
                c[row][col]=sc.nextInt();
            }
        }
        String ans = "Yes";
        for(int col=2;col<=3;col++){
            int cur = c[1][1]-c[1][col];
            int d1 = c[2][1]-c[2][col];
            int d2 = c[3][1]-c[3][col];
            if(cur!=d1||cur!=d2)  ans  = "No";
        }
        if(!(c[1][2]-c[1][3]==c[2][2]-c[2][3]&&c[1][2]-c[1][3]==c[3][2]-c[3][3])) ans = "No";

        for(int row=2;row<=3;row++){
            int cur = c[1][1]-c[row][1];
            int d1 = c[1][2]-c[row][2];
            int d2 = c[1][3]-c[row][3];
            if(cur!=d1||cur!=d2)  ans  = "No";
        }
        if(!(c[2][1]-c[3][1]==c[2][2]-c[3][2]&&c[2][1]-c[3][1]==c[2][3]-c[3][3])) ans = "No";


        System.out.println(ans);


    }
}