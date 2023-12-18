
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

final class Main {

    public static final int HEIGHT = 8;
    public static final int WIDTH = 8;
    private static final String[] BLOCK_NAME_LIST = {"A", "B", "C", "D", "E",
                                                     "F", "G"};
    private static final char[][] A = {{1, 1}, {1, 1}};
    private static final char[][] B = {{1}, {1}, {1}, {1}};
    private static final char[][] C = {{1, 1, 1, 1}};
    private static final char[][] D = {{0, 1}, {1, 1}, {1, 0}};
    private static final char[][] E = {{1, 1, 0}, {0, 1, 1}};
    private static final char[][] F = {{1, 0}, {1, 1}, {0, 1}};
    private static final char[][] G = {{0, 1, 1}, {1, 1, 0}};
    private static final ArrayList<char[][]> BLOCKS = new ArrayList<char[][]>();

    private static String solv(final char[][] field) {
        int blockIndex = 0;
        for (char[][] block : BLOCKS) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    boolean exist = true;
                    for (int k = 0; exist && k < block.length; k++) {
                        for (int l = 0; exist && l < block[k].length; l++) {
                            if (field.length <= i + k
                                    || field[i + k].length <= j + l) {
                                exist = false;
                                continue;
                            }
                            if (field[i + k][j + l] != block[k][l]) {
                                exist = false;
                                break;
                            }
                        }
                    }
                    if (exist) {
                        return BLOCK_NAME_LIST[blockIndex];
                    }
                }
            }
            blockIndex++;
        }
        return BLOCK_NAME_LIST[blockIndex - 1];
    }

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        BLOCKS.add(A);
        BLOCKS.add(B);
        BLOCKS.add(C);
        BLOCKS.add(D);
        BLOCKS.add(E);
        BLOCKS.add(F);
        BLOCKS.add(G);
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            char[][] field = new char[WIDTH][HEIGHT];
            int lineCount = 0;
            do {
                field[lineCount] = input.toCharArray();
                for (int i = 0; i < field[lineCount].length; i++) {
                    field[lineCount][i] = (char) (field[lineCount][i] - '0');
                }
                lineCount++;
                input = inputReader.readLine();
            } while (input != null && !input.equals(""));
            String ret = solv(field);
            System.out.println(ret);
        }
    }
}