import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        boolean[][] checked = new boolean[3][3];
        boolean bingoed = false;
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int b = sc.nextInt();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(b == A[j][k]){
                        checked[j][k] = true;
                    }
                }
            }
        }
        for(int i=0;i < 3;i++){
            if(checked[i][0] && checked[i][1] &&checked[i][2]){
                bingoed = true;
            }
            if(checked[0][i] && checked[1][i] && checked[2][i]){
                bingoed = true;
            }
        }
        if(checked[1][1]){
            if(checked[0][2] && checked[2][0]){
                bingoed = true;
            }
            if(checked[0][0] && checked[2][2]){
                bingoed = true;
            }
        }



        if(bingoed){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

}






