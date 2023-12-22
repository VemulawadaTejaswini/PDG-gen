import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        int a = 0;
        int b = 0;
        int f = 0;
        int r = 0;
        int v = 0;
        int b1[][];
        int b2[][];
        int b3[][];
        int b4[][];

        b1 = new int[3][10];
        b2 = new int[3][10];
        b3 = new int[3][10];
        b4 = new int[3][10];

//        for (int i = 0; i < 3; i++) {
//            b1[i] = new int[10];
//            b2[i] = new int[10];
//            b3[i] = new int[10];
//            b4[i] = new int[10];
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {

            String[] line = br.readLine().split(" ");

            b = Integer.parseInt(line[0]);
            f = Integer.parseInt(line[1]) - 1;
            r = Integer.parseInt(line[2]) - 1;
            v = Integer.parseInt(line[3]);

            if (0 < b && b < 5 && 0 <= f && f < 3 && 0 <= r && r < 10) {

                if (b == 1) {
                    b1[f][r] += v;
                }

                if (b == 2) {
                    b2[f][r] += v;
                }

                if (b == 3) {
                    b3[f][r] += v;
                }

                if (b == 4) {
                    b4[f][r] += v;
                }

            }
            
            else {
                
            }

        }

        for (int i = 1; i < 5; i++) {

            if (i == 1) {
                for (int c = 0; c < 3; c++) {

                    for (int x = 0; x < 10; x++) {

                        if (x != 9) {
                            System.out.print(" " + b1[c][x]);
                        } else {
                            System.out.println(" " + b1[c][x]);
                        }

                    }
                }
                System.out.println("####################");
            }

            if (i == 2) {
                for (int c = 0; c < 3; c++) {

                    for (int x = 0; x < 10; x++) {

                        if (x != 9) {
                            System.out.print(" " + b2[c][x]);
                        } else {
                            System.out.println(" " + b2[c][x]);
                        }

                    }
                }
                System.out.println("####################");
            }

            if (i == 3) {
                for (int c = 0; c < 3; c++) {

                    for (int x = 0; x < 10; x++) {

                        if (x != 9) {
                            System.out.print(" " + b3[c][x]);
                        } else {
                            System.out.println(" " + b3[c][x]);
                        }

                    }
                }
                System.out.println("####################");
            }

            if (i == 4) {
                for (int c = 0; c < 3; c++) {

                    for (int x = 0; x < 10; x++) {

                        if (x != 9) {
                            System.out.print(" " + b4[c][x]);
                        } else {
                            System.out.println(" " + b4[c][x]);
                        }

                    }
                }
            }

            

        }

    }

}