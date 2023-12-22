import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 		//座標で
        int[][] c = new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                c[i][j] = sc.nextInt();
            }
        }
 
        int[] x = new int[3];
        int[] y = new int[3];
      	//y[0] =c[0][0]-x[0]するため代入
        x[0] = 0;
        for(int i=0; i<3; i++) {
            y[i] = c[0][i] - x[0];
        }
        for(int i=0; i<3; i++) {
            x[i] = c[i][0] - y[0];
        }
 
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(c[i][j] != x[i]+y[j]) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}