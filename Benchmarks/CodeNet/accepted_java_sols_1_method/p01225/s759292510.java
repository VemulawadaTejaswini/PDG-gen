import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                int player = sc.nextInt();

        int []number = new int[9];
        String []color = new String[9];

        for(int playerNum = 0; playerNum < player; playerNum++) {

                //セット数
                int setCount = 0;

                List<Integer> R = new ArrayList<Integer>();
            List<Integer> G = new ArrayList<Integer>();
            List<Integer> B = new ArrayList<Integer>();

                //カードの番号を格納
                for(int cardNum = 0; cardNum < 9; cardNum++) {
                        number[cardNum] = sc.nextInt();
                }
                //カードの色を格納
                for(int cardnum = 0; cardnum < 9; cardnum++) {
                        color[cardnum] = sc.next();
                }

                //RGBそれぞれのリストにカードの数字を格納
                for(int CardNum = 0; CardNum < 9; CardNum++) {
                        if(color[CardNum].equals("R")) {
                                R.add(number[CardNum]);
                        }
                        if(color[CardNum].equals("G")) {
                                G.add(number[CardNum]);
                        }
                        if(color[CardNum].equals("B")) {
                                B.add(number[CardNum]);
                        }

            }

            //降順に並び替える
            Collections.sort(R);
            Collections.sort(G);
            Collections.sort(B);

            int origin = 0;

            //Rリスト(連番)
            for(int r = 0; r < R.size()-2; r++) {
                origin = R.get(r);

                if(origin != 0) {
                        if(R.contains(origin + 1) && R.contains(origin + 2)) {
                                setCount ++;
                                R.set(R.indexOf(origin), 0);
                                R.set(R.indexOf(origin + 1), 0);
                                R.set(R.indexOf(origin + 2), 0);
                        }
                }
            }

            //Rリスト（同数字）
            for(int r = 0; r < R.size()-2; r++) {
                if(R.get(r) != 0) {
                        origin = R.get(r);

                        if(R.get(r + 1) == origin && R.get(r + 2) == origin) {
                                setCount++;
                                R.set(r, 0);
                                R.set(r + 1, 0);
                                R.set(r + 2, 0);
                        }
                }
            }

            //Gリスト(連番)
            for(int g = 0; g < G.size()-2; g++) {
                origin = G.get(g);

                //連番確認
                if(origin != 0) {
                        if(G.contains(origin + 1) && G.contains(origin + 2)) {
                                setCount ++;
                                G.set(G.indexOf(origin), 0);
                                G.set(G.indexOf(origin + 1), 0);
                                G.set(G.indexOf(origin + 2), 0);
                        }
                }
            }

            //Gリスト（同数字）
            for(int g = 0; g < G.size()-2; g++) {
                if(G.get(g) != 0) {
                        origin = G.get(g);

                        if(G.get(g + 1) == origin && G.get(g + 2) == origin) {
                                setCount++;
                                G.set(g, 0);
                                G.set(g + 1, 0);
                                G.set(g + 2, 0);
                        }
                }
            }

            //Bリスト(連番)
            for(int b = 0; b < B.size()-2; b++) {
                origin = B.get(b);

                //連番確認
                if(origin != 0) {
                        if(B.contains(origin + 1) && B.contains(origin + 2)) {
                                setCount ++;
                                B.set(B.indexOf(origin), 0);
                                B.set(B.indexOf(origin + 1), 0);
                                B.set(B.indexOf(origin + 2), 0);
                        }
                }
            }

            //Bリスト（同数字）
            for(int b = 0; b < B.size()-2; b++) {
                if(B.get(b) != 0) {
                        origin = B.get(b);

                        if(B.get(b + 1) == origin && B.get(b + 2) == origin) {
                                setCount++;
                                B.set(b, 0);
                                B.set(b + 1, 0);
                                B.set(b + 2, 0);
                        }
                }
            }

            if(setCount == 3) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
    }
}

