import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int M = sc.nextInt();
        int[][] HWz = new int[2][M];
        for (int i = 0; i < M; i++) {
            HWz[0][i] = sc.nextInt() - 1;
            HWz[1][i] = sc.nextInt() - 1;
        }

        int[] rowSum = new int[W];
        int[] colSum = new int[H];


        int[][] bombed = new int[H][W];

        for (int i = 0; i < M; i++){
//            System.out.println("i "+i);
            colSum[HWz[0][i]]++;
            rowSum[HWz[1][i]]++;

            bombed[HWz[0][i]][HWz[1][i]] = 1;
        }

        int colMax = 0;
        int rowMax = 0;
        for (int i = 0; i < W; i++){
            if (rowMax < rowSum[i]){
                rowMax = rowSum[i];
            }
        }
        for (int i = 0; i < H; i++){
            if (colMax < colSum[i]){
                colMax = colSum[i];
            }
        }

//        System.out.println("colMax "+ colMax);
//        System.out.println("rowMax "+ rowMax);
        List<Integer> rowMaxs = new ArrayList<>();
        for (int i = 0; i < H; i++){
            if (rowSum[i] == rowMax){
                rowMaxs.add(i);
            }
        }
        List<Integer> colMaxs = new ArrayList<>();
        for (int i = 0; i < H; i++){
            if (colSum[i] == colMax){
                colMaxs.add(i);
            }
        }

//
//        for (int i = 0; i < rowMaxs.size(); i++){
//            for (int j = 0; j < colMaxs.size(); j++){
//                System.out.println(colMaxs.get(j)+" "+rowMaxs.get(i));
//            }
//        }

//        System.out.println("aaa");

        int bom_flg = 1;
        for (int i = 0; i < rowMaxs.size(); i++){
            for (int j = 0; j < colMaxs.size(); j++){
//                System.out.println(i+" "+j);
                if (bombed[colMaxs.get(j)][rowMaxs.get(i)] == 0){
                    bom_flg = 0;
                    break;
                }
            }
        }

        if (bom_flg == 0) System.out.println(colMax + rowMax);
        else System.out.println(colMax + rowMax - 1);

    }
}