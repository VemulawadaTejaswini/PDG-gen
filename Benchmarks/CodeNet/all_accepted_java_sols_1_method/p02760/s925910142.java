import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] card = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[][] card1 = new int[3][3];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(b == card[j][k]){
                        card1[j][k] = 1;
                    }
                }
            }
        }

        int flag = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < 3; i++) {
            int count = 0;
            int count1 = 0;

            for (int j = 0; j < 3; j++) {
                if(card1[i][j] == 1){
                    count ++;
                }
                if(card1[j][i] == 1){
                    count1 ++;
                }
            }
            if(card1[i][i] == 1){
                count2 ++;
            }
            if(card1[i][2-i] == 1){
                count3 ++;
            }
            if(count == 3 || count1 == 3 || count2 == 3 || count3 == 3){
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
