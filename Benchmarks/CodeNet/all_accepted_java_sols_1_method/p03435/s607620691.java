import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[][] c = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                c[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int a1, b1, b2, b3;
        a1 = 0;
        b1 = c[0][0];
        b2 = c[0][1];
        b3 = c[0][2];
        if(c[1][0] - b1 == c[1][1] - b2 && c[1][1] - b2 == c[1][2] - b3){

        } else {
            System.out.println("No");
            return;
        }
        if(c[2][0] - b1 == c[2][1] - b2 && c[2][1] - b2 == c[2][2] - b3){

        } else {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}