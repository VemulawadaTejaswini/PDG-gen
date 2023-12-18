import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        String[] in = null;
        int a, b;
        int numConstractionPoint;

        try {
            while ((line = input.readLine()) != null) {
                in = line.split(" "); // read a,b
                if (in[0].equals("0") && in[1].equals("0")) {
                    break;
                }
                a = Integer.parseInt(in[0]);
                b = Integer.parseInt(in[1]);

                // read number of constractionPoint
                numConstractionPoint = Integer.parseInt(input.readLine());

                // read contractionPoint
                int[][] intersection = new int[b][a];
                int constractionX, constractionY;
                for (int i = 0; i < numConstractionPoint; i++) {
                    line = input.readLine();
                    in = line.split(" ");
                    constractionX = Integer.parseInt(in[0]) - 1;
                    constractionY = Integer.parseInt(in[1]) - 1;
                    if (constractionY == 0) {
                        for (int j = constractionX; j < a; j++) {
                            intersection[0][j] = -1;
                        }
                    } else if (constractionX == 0) {
                        for (int j = constractionY; j < b; j++) {
                            intersection[j][0] = -1;
                        }
                    } else {
                        intersection[constractionY][constractionX] = -1;
                    }
                }
                if (intersection[0][0] < 0) { // start is constractionPoint
                    System.out.println(0);
                    break;
                }

                // solve
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < a; j++) {
                        if (intersection[i][j] < 0) { // [i][j] is constractionPoint etc...
                            intersection[i][j] = 0;
                        } else if (i == 0 || j == 0) { // [i][j] is latticeEnd(left or under)
                            intersection[i][j]++;
                        } else {
                            intersection[i][j] = intersection[i - 1][j] + intersection[i][j - 1];
                        }
                    }
                }
                System.out.println(intersection[b - 1][a - 1]);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
