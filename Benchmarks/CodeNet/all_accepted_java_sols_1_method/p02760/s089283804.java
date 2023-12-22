import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] card = new int[3][3];
        int[][] hit = new int[3][3];
        for (int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                card[i][j] = sc.nextInt();
                hit[i][j] = 0;
            }
        }
        int n = sc.nextInt();
        for (int k =0; k<n;k++){
            int b = sc.nextInt();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(card[i][j] == b){
                        hit[i][j]= 1;
                    }
                }
            }
        }
        int flag=0;
        for (int i=0;i<3;i++){
            if(hit[i][0] == 1 && hit[i][1] == 1 && hit[i][2] == 1) {
                flag = 1;
            }
            if(hit[0][i] ==1 && hit[1][i] == 1 && hit[2][i] == 1) {
                flag = 1;
            }
        }
        if (hit[0][0] == 1 && hit[1][1] == 1 && hit[2][2] == 1) {
            flag = 1;
        }
        if (hit[2][0] == 1 && hit[1][1] == 1 && hit[0][2] == 1) {
            flag =1;
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
