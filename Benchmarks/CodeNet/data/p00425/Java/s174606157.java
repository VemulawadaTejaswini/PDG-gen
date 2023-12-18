import java.io.IOException;

public class P0502 {

    /**
     *
     * 標準入力から1行読み込む。
     * <p>
     * 指定された長さまで、1行分文字列を読み込む。
     * 行末の判断は EOF(-1) または 改行('\n')を用いる。
     * </p>
     * @param maxLength
     * @return 1行分読み込んだ文字列
     */
    private static String ReadLn(int maxLength) {
        byte line[] = new byte[maxLength];
        int length = 0;
        int character = -1;

        try {
            while (length < maxLength) {
                character = System.in.read();
                if ((character < 0) || (character == '\n'))
                    break;
                line[length++] += character;
            }
        } catch (IOException e) {
            return null;
        }

        if ((character < 0) && (length == 0))
            return null; // eof
        return (new String(line, 0, length - 1));
    }

    public static void main(String args[]) {
        P0502 myWork = new P0502(); // create a dinamic instance
        myWork.Begin(); // the true entry point
    }

    private static final int NOT_TURN = 0;
    private static final int RIGHT = 1;
    private static final int LEFT = 2;
    private static final int NORTH = 1;
    private static final int EAST = 2;
    private static final int SOUTH = 3;
    private static final int WEST = 4;

    // 合計値
    private int sum = 1;

    // 向き
    private int[] dice = { 1, 5, 3, 2, 4 };

    private int isTurn(String value) {
        if ("Right".equals(value)) {
            return RIGHT;
        } else if ("Left".equals(value)) {
            return LEFT;
        }
        return NOT_TURN;
    }

    private int whichDirection(String value) {
        if ("North".equals(value)) {
            return NORTH;
        } else if ("East".equals(value)) {
            return EAST;
        } else if ("South".equals(value)) {
            return SOUTH;
        }
        return WEST;
    }

    public void Begin() {

        String input = null;
        while ((input = P0502.ReadLn(255)) != null) {

            if ("0".equals(input)) {
                break;
            }
            System.out.println(input);
            int loop = Integer.parseInt(input);
            for (int i = 0; i < loop; i++) {
                String command = P0502.ReadLn(255);
                int turn = isTurn(command);
                int tmp = 0;
                switch (turn) {
                case RIGHT:
                    tmp = dice[4];
                    for (int j = 1; j < 4; j++) {
                        dice[j + 1] = dice[j];
                    }
                    dice[1] = tmp;
                    break;
                case LEFT:
                    tmp = dice[0];
                    for (int j = 3; j >= 1; j--) {
                        dice[j] = dice[j + 1];
                    }
                    dice[4] = tmp;
                    break;
                default:
                    int direction = whichDirection(command);
                    switch (direction) {
                    case NORTH:
                        dice[NORTH] = dice[0];
                        dice[0] = dice[SOUTH];
                        dice[SOUTH] = 7 - dice[NORTH];
                        break;
                    case EAST:
                        dice[EAST] = dice[0];
                        dice[0] = dice[WEST];
                        dice[WEST] = 7 - dice[EAST];
                        break;
                    case SOUTH:
                        dice[SOUTH] = dice[0];
                        dice[0] = dice[NORTH];
                        dice[NORTH] = 7 - dice[SOUTH];
                        break;
                    default:
                        dice[WEST] = dice[0];
                        dice[0] = dice[EAST];
                        dice[EAST] = 7 - dice[WEST];
                        break;
                    }
                    break;
                }

                sum += dice[0];
            }

            System.out.println(sum);
        }

    }
}