import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                c[i][j] = s.charAt(j);
            }
        }
        List<Integer> cuth = new ArrayList<>();
        List<List<Integer>> cutw = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            boolean hasS = false;
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < w; j++) {
                if (c[i][j] == '#') {
                    tempList.add(j);
                    hasS = true;
                }
                if (j == w - 1 && c[i][j] == '.' && hasS) {
                    tempList.remove(tempList.size() - 1);
                    tempList.add(j);
                }
            }
            if (tempList.size() != 0) {
                cutw.add(tempList);
            }
            if (hasS) {
                cuth.add(i);
            }
            if (i == h - 1 && !hasS) {
                cuth.remove(cuth.size() - 1);
                cuth.add(i);
            }
        }
        int[][] ans = new int[h][w];
        int starth = 0;
        int startw = 0;
        int ansNum = 1;
        for (int i = 0; i < cuth.size(); i++) {
            List<Integer> tempList = cutw.get(i);
            for (int a : tempList) {
                for (int j = starth; j <= cuth.get(i); j++) {
                    for (int l = startw; l <= a; l++) {
                        ans[j][l] = ansNum;
                    }
                }
                startw = a + 1;
                ansNum++;
            }
            starth = cuth.get(i) + 1;
            startw = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int[] list : ans) {
            for (int a : list) {
                sb.append(a + " ");
            }
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}