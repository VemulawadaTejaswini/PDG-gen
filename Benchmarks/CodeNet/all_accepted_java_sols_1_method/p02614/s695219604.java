import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int H = scan.nextInt();
                int W = scan.nextInt();
                int K = scan.nextInt();

                int output = 0;

                String[][] c = new String[H][W];

                for (int h = 0; h < H; h++) {
                	String tempS = scan.next();
                	for (int w = 0; w < W; w++) {
                		c[h][w] = tempS.substring(w, w+1);
                	}
                }

                for (int bit = 0; bit < Math.pow(2, H + W); bit++) {
                	int count = 0;
                	String[][] tempC = new String[H][W];
                	for (int h = 0; h < H; h++) {
                    	for (int w = 0; w < W; w++) {
                    		tempC[h][w] = c[h][w];
                    	}
                    }

                	for (int shift = 0; shift < H; shift++) {
                		if ((1&(bit>>shift)) == 1) {
                			for (int column = 0; column < W; column++) {
                				tempC[shift][column] = "red";
                			}
                		}
                	}

                	for (int shift = 0; shift < W; shift++) {
                		if ((1&(bit>>(shift+H))) == 1) {
                			for (int row = 0; row < H; row++) {
                				tempC[row][shift] = "red";
                			}
                		}
                	}

                    for (int h = 0; h < H; h++) {
                    	for (int w = 0; w < W; w++) {
                    		if (tempC[h][w].equals("#")) {
                    			count++;
                    		}
                    	}
                    }

                    if (count == K) {
                    	output++;
                    }

                }


                System.out.println(output);

                scan.close();

        }

}