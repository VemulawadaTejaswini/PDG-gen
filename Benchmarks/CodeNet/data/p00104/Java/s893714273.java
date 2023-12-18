
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public char[][] tile;
    public int[][] movedTile;

    public static void main(String[] args) throws IOException {
        BufferedReader bReader =
                new BufferedReader(new InputStreamReader(System.in));
        String inputedStr;

        while (!"0 0".equals(inputedStr = bReader.readLine())) {
            boolean loopFlag = true;
            String[] editedstr = inputedStr.split(" ");
            int X = Integer.parseInt(editedstr[0]);
            int Y = Integer.parseInt(editedstr[1]);
            char[][] tile = new char[X][Y];
            int[][] movedTile = new int[X][Y];
            int xcurrentloc = 0;
            int ycurrentloc = 0;
            for (int i = 0; i < X; i++) {
                tile[i] = bReader.readLine().toCharArray();
            }
            while (movedTile[xcurrentloc][ycurrentloc] != 1) {
                if (tile[xcurrentloc][ycurrentloc] == '>') {
                    movedTile[xcurrentloc][ycurrentloc++] = 1;
                } else if (tile[xcurrentloc][ycurrentloc] == '<') {
                    movedTile[xcurrentloc][ycurrentloc--] = 1;
                } else if (tile[xcurrentloc][ycurrentloc] == 'v') {
                    movedTile[xcurrentloc++][ycurrentloc] = 1;
                } else if (tile[xcurrentloc][ycurrentloc] == '^') {
                    movedTile[xcurrentloc--][ycurrentloc] = 1;
                } else if (tile[xcurrentloc][ycurrentloc] == '.') {
                    loopFlag = false;
                    break;
                } else {
                }
            }
            if (loopFlag) {
                System.out.println("LOOP");
                loopFlag = true;
            } else {
                System.out.println(xcurrentloc + " " + ycurrentloc);
            }
        }
    }
}