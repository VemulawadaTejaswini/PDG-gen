import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int flag[][] = new int[3][3];
        int n;
        int b[] = new int[10];
        int flag1, flag2, flag3;
        String result = "No";
        int cal1;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            b[i] = scanner.nextInt();
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if(b[i] == a[j][k]){
                        flag[j][k] = 1;
                    }
                }
            }
        }
        if(flag[0][0] == 1 && flag[0][1] == 1 && flag[0][2] == 1){
            result = "Yes";
        }else if(flag[0][0] == 1 && flag[1][1] == 1 && flag[2][2] == 1){
            result = "Yes";
        }else if(flag[0][0] == 1 && flag[1][0] == 1 && flag[2][0] == 1){
            result = "Yes";
        }else if(flag[0][1] == 1 && flag[1][1] == 1 && flag[2][1] == 1){
            result = "Yes";
        }else if(flag[0][1] == 1 && flag[1][1] == 1 && flag[2][1] == 1){
            result = "Yes";
        }else if(flag[1][0] == 1 && flag[1][1] == 1 && flag[1][2] == 1){
            result = "Yes";
        }else if(flag[2][0] == 1 && flag[1][1] == 1 && flag[0][2] == 1){
            result = "Yes";
        }else if(flag[2][0] == 1 && flag[2][1] == 1 && flag[2][2] == 1){
            result = "Yes";
        }else if(flag[0][2] == 1 && flag[1][2] == 1 && flag[2][2] == 1){
            result = "Yes";
        }

        System.out.println(result);
    }
}