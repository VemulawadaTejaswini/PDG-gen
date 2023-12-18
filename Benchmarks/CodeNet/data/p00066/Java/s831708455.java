import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    /**
     * ???
     */
    public static final String CIRCLE = "o";

    /**
     * ??
     */
    public static final String CROSS = "x";

    /**
     * draw
     */
    public static final String DRAW = "d";

    /**
     * ????????°???
     */
    public static final int CIRCLE_NUMBER = 1;
    /**
     * ???????°???
     */
    public static final int CROSS_NUMBER = 0;

    /**
     * draw?????°???
     */
    public static final int DRAW_NUMBER = -1;

    /**
     * ??????????????????
     */
    public static final int COUNT_WIN = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // ?????????????????????
        List<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

//            if ("".equals(input)) {
//                break;
//            }
            // ??\???????????????
            int[] gameResult = createGameResult(input.split(""));

            // ???????????????????????????????????????????????????????????????
            list.add(judgeWinner(gameResult));
        }
        // ??¢???????????????

        for (String string : list) {
            System.out.println(string);
        }
        sc.close();
    }

    // createGameResult
    /**
     * ?????? ???????????????????????´??????
     * 
     * @return gameResult
     */
    public static int[] createGameResult(String[] input) {
        // ??\??????????´??????????-1??§?????????????????????????????\?????¨?????????
        int[] board = getfilledArray();

        // ?????????1??§????????0????????\?????????-1
        for (int i = 0; i < input.length; i++) {
            if (CIRCLE.equals(input[i])) {
                board[i] = CIRCLE_NUMBER;
            }

            if (CROSS.equals(input[i])) {
                board[i] = CROSS_NUMBER;
            }
        }

        return board;
    }

    // fillArray
    /**
     * ?????? ????????????????????????????????´??????
     * 
     * @return filledArray
     */
    public static int[] getfilledArray() {
        int[] board = new int[9];
        Arrays.fill(board, DRAW_NUMBER);
        return board;
    }

    // horizontal?????????????????£?¶??????????????????????
    public static int judgeHorizontal(int[] gameResult) {
        int circleCount = 0;
        int crossCount = 0;

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                circleCount = 0;
                crossCount = 0;
            }
            switch (gameResult[i]) {
            case CIRCLE_NUMBER:
                circleCount++;
                break;
            case CROSS_NUMBER:
                crossCount++;
                break;
            }
            // ????????????
            if (circleCount == COUNT_WIN) {
                return CIRCLE_NUMBER;
            }
            // ???????????
            if (crossCount == COUNT_WIN) {
                return CROSS_NUMBER;
            }

        }

        return DRAW_NUMBER;
    }

    // vertical?????????????????£?¶???????????????????
    public static int judgeVerticel(int[] gameResult) {
        int circleCount = 0;
        int crossCount = 0;

        for (int i = 0; i < 3; i++) {
            circleCount = 0;
            crossCount = 0;
            for (int j = i; j < i + 7; j += 3) {
                switch (gameResult[j]) {
                case CIRCLE_NUMBER:
                    circleCount++;
                    break;
                case CROSS_NUMBER:
                    crossCount++;
                    break;
                }

                // ????????????
                if (circleCount == COUNT_WIN) {
                    return CIRCLE_NUMBER;
                }
                // ???????????
                if (crossCount == COUNT_WIN) {
                    return CROSS_NUMBER;
                }
            }
        }
        return DRAW_NUMBER;
    }

    // ????????????????????????????????????
    public static int judgeDiagonal(int[] gameResult) {
        int circleCount = 0;
        int crossCount = 0;

        for (int i = 0; i < 3; i += 2) {
            circleCount = 0;
            crossCount = 0;
            for (int j = i; j < 9; j += 4) {
                switch (gameResult[j]) {
                case CIRCLE_NUMBER:
                    circleCount++;
                    break;
                case CROSS_NUMBER:
                    crossCount++;
                    break;
                }

                // ????????????
                if (circleCount == 3) {
                    return CIRCLE_NUMBER;
                }
                // ???????????
                if (crossCount == 3) {
                    return CROSS_NUMBER;
                }
            }
        }
        return DRAW_NUMBER;
    }

    // judgeWinner
    public static String judgeWinner(int[] gameResult) {
        int winner = DRAW_NUMBER;
        if ((winner = judgeHorizontal(gameResult)) != DRAW_NUMBER) {
            return returnString(winner);
        }
        if ((winner = judgeVerticel(gameResult)) != DRAW_NUMBER) {
            return returnString(winner);
        }

        if ((winner = judgeDiagonal(gameResult)) != DRAW_NUMBER) {
            return returnString(winner);
        }

        return returnString(winner);
    }

    public static String returnString(int i) {
        switch (i) {
        case CIRCLE_NUMBER:
            return CIRCLE;
        case CROSS_NUMBER:
            return CROSS;
        default:
            return DRAW;
        }
    }
}