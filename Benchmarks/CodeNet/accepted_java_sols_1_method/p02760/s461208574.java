import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int[][] A = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                A[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();

        int[] b = new int[N];
        for(int i=0; i<N; i++){
            b[i] = sc.nextInt();
        }

        int[][] x = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                x[i][j] = 0;
                for(int k=0; k<N; k++){
                    if(A[i][j]==b[k]){
                        x[i][j] = 1;
                        break;
                    }
                }
            }
        }

        for(int i=0; i<3; i++){
            if(x[i][0]==1 && x[i][1]==1 && x[i][2]==1){
                System.out.println("Yes");
                return;
            }
        }
        for(int i=0; i<3; i++){
            if(x[0][i]==1 && x[1][i]==1 && x[2][i]==1){
                System.out.println("Yes");
                return;
            }
        }
        if(x[0][0]==1 && x[1][1]==1 && x[2][2]==1){
            System.out.println("Yes");
            return;
        }
        if(x[2][0]==1 && x[1][1]==1 && x[0][2]==1){
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}