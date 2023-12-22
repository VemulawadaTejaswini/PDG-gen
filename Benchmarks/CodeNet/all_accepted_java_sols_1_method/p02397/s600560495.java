import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        int mat [][] = new int[3001][2];
        Scanner input = new Scanner(System.in);
        int n = 0;
        int t1,t2;
        while(true){
            t1 = input.nextInt();
            t2 = input.nextInt();
            if (t1 == 0 && t2 == 0){
                break;
            } else {
                mat[n][0] = t1;
                mat[n][1] = t2;
                n += 1;
            }
        }
        for (int i = 0; i < n; i++){
            if ((mat[i][0] > mat[i][1])){
                System.out.printf("%d %d\n",mat[i][1],mat[i][0]);
            } else {
                System.out.printf("%d %d\n",mat[i][0],mat[i][1]);
            }
        }
    }
}
