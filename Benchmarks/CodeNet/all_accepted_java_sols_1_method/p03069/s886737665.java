import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        int[] blackCnt = new int[N+1];
        int[] whiteCnt = new int[N+2];
        blackCnt[0] = 0;
        whiteCnt[N+1] = 0;
        int w = 0;

        for(int i = 1; i<N+1; i++) {
            char c = S.charAt(i-1);
            blackCnt[i] = blackCnt[i-1];
            if(c == '#') blackCnt[i] += 1;
            if(c == '.') w++;
            //            System.out.println("b " + i + " " + blackCnt[i]);
        }
        whiteCnt[0] = w;
        for(int i = 1; i<N+1; i++) {
            char c = S.charAt(i-1);
            whiteCnt[i] = whiteCnt[i-1];
            if(c == '.') {
                whiteCnt[i] -= 1;
            }
            //            System.out.println("w " + i + " " + whiteCnt[i]);
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1; i<N+1; i++) {
            min = Math.min(min, blackCnt[i-1]+whiteCnt[i]);
            //            System.out.println(min);
        }
        System.out.println(min);
    }
}