import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int H  = Integer.parseInt(s.nextLine());
//        int W  = Integer.parseInt(s.nextLine());
//        int K  = Integer.parseInt(s.nextLine());
        String nums = s.nextLine();
        int H = Integer.parseInt(nums.split(" ", 3)[0]);
        int W = Integer.parseInt(nums.split(" ", 3)[1]);
        int K = Integer.parseInt(nums.split(" ", 3)[2]);
        String line = "";
        char[][] box = new char[H][W];
        for (int i = 0; i < H; i++){
            line = s.nextLine();
//            System.out.println(line);
            box[i] = line.toCharArray();//.split("",W);
        }
//        System.out.println(H+" "+W+" "+K);
//        System.out.println(box.length);
//        System.out.println(box[0].length);
        int[] blackRow = new int[H];
        int[] blackCol = new int[W];

        int allBlack = 0;
        int eachRow = 0;
        for (int i = 0; i < H; i++){
            eachRow = 0;
            for (int j = 0; j < W; j++){
//                System.out.println(box[i][j]);
                if ('#' == box[i][j]){
                    allBlack++;
                    eachRow++;
                }
            }
            blackRow[i] = eachRow;
        }
        int eachCol = 0;
        for (int i = 0; i < W; i++){
            eachCol = 0;
            for (int j = 0; j < H; j++){
//                System.out.println(box[j][i]);
                if ('#' == box[j][i]){
                    eachCol++;
                }
            }
            blackCol[i] = eachCol;
        }


//        System.out.println(allBlack);
        HashSet<Integer> colSet = new HashSet<Integer>();
        HashSet<Integer> rowSet = new HashSet<Integer>();
        int ans = 0;
        char[][] checked = new char[H][W];
        int sharpNum = 0;
        for (int i = 0; i < Math.pow(2, H); i++){
            for (int j = 0; j < Math.pow(2, W); j++){
                colSet = new HashSet<Integer>();
                rowSet = new HashSet<Integer>();
                for (int n = 0; n < H; n++){
                    if ((1&i>>n) == 1){
                        rowSet.add(n);
                    }
                }
                for (int n = 0; n < W; n++){
                    if ((1&j>>n) == 1){
                        colSet.add(n);
                    }
                }
                sharpNum = 0;
                checked = new char[H][W];
//                System.out.println("rowSet"+rowSet);
//                System.out.println("colSet"+colSet);
                for (int n: rowSet){
                    for (int m = 0; m < W; m++){
                        if ((box[n][m] == '#') && (checked[n][m] == 0)){
                            sharpNum++;
                            checked[n][m] = 1;
                        }
                    }
                }
                for (int n: colSet){
                    for (int m = 0; m < H; m++){
                        if ((box[m][n] == '#') && (checked[m][n] == 0)){
                            sharpNum++;
                            checked[m][n] = 1;
                        }
                    }
                }
                if (sharpNum == allBlack - K){
                    ans++;
                }
            }
        }
        System.out.println(ans);



//        int remRow = 0;
//        int remCol = 0;
//        int dup = 0;
//        int ans = 0;
//        int target = 0;
//
//
//        for (int i = 0; i < H; i++){
//            remRow = blackRow[i];
//            target = allBlack - remRow;
//            if (target == K){
//                ans++;
//            }
//        }
//        for (int i = 0; i < W; i++){
//            remCol = blackCol[i];
//            target = allBlack - remCol;
//            if (target == K){
//                System.out.println("col i,j "+i+" ");
//                ans++;
//            }
//        }
//
//        for (int i = 0; i < H; i++){
//            for (int j = 0; j < W; j++) {
//                dup = 0;
//                remRow = blackRow[i];
//                remCol = blackCol[j];
//                if (box[i][j] == '#') dup = 1;
//                target = allBlack - remCol - remRow + dup;
//                if (target == K){
//                    System.out.println("row col i,j "+i+" "+j);
//                    ans++;
//                }
//            }
//        }
//        System.out.println("ans: "+ans);
//        for (int i = -1; i < W; i++){
//            for (int j = -1; j < H; j++) {
//                if (i == -1){
//                    remRow = 0;
//                } else {
//                    remRow = blackRow[i];
//                }
//                if (j == -1){
//                    remCol = 0;
//                } else {
//                    remCol = blackCol[j];
//                }
//            }
//        }

    }
}