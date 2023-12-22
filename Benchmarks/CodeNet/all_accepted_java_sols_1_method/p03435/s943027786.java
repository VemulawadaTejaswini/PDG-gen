import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] l = new int[3][3];
        for(int i = 0;i < 3;i++)    for(int j = 0;j < 3;j++)    l[i][j] = sc.nextInt();
        if(l[0][0] + l[1][1] == l[1][0] + l[0][1] 
            && l[0][0] + l[2][1] == l[2][0] + l[0][1] 
                && l[1][0] + l[0][2] == l[0][0] + l[1][2]
                    && l[0][0] + l[2][2] == l[2][0] + l[0][2])  System.out.println("Yes");
        else    System.out.println("No");
    }
}