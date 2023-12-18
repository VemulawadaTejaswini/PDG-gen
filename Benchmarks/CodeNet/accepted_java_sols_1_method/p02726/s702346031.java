import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = i; j < N; j++) {
                matrix[i][j] = j - i;
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = i; j < N; j++) {
                int val = Math.abs(X - (i + 1)) + Math.abs(Y - (j + 1)) + 1;
//                System.out.println("i: "+i+" j:"+j+" matrix[i][j]: "+matrix[i][j]+" val: "+val);
                if (matrix[i][j] > val){
                    matrix[i][j] = val;
                }
//                System.out.println("i: "+(i+1)+" j:"+(j+1)+" matrix[i][j]: "+matrix[i][j]+" val: "+val);
            }
        }
//        HashMap<Integer,Integer> numVals = new HashMap<>();
        int[] numVals = new int[N];
        for (int i = 0; i < N; i++){
            for (int j = i; j < N; j++) {
//                System.out.println("i: "+i+" j:"+j+" matrix[i][j]: "+matrix[i][j]);
                numVals[matrix[i][j]]++;
            }
        }

        for (int n = 1; n < N; n++){
            System.out.println(numVals[n]);
        }

//        for (int i = 0; i < N; i++){
//            for (int j = i; j < N; j++) {
//                System.out.println("i: "+i+" j:"+j+" matrix[i][j]: "+matrix[i][j]);
//            }
//        }


    }
}
