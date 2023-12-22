import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][][] number = new int[4][3][10];

        for (int b = 0; b < 4; b++) {
            for (int f = 0; f < 3;f++) {
                for(int r = 0; r < 10;r++) {
                    number[b][f][r] = 0;
                }
            }
        }

        while(n != 0){
            String str[] = br.readLine().split(" ");
            int b = Integer.parseInt(str[0]) - 1;
            int f = Integer.parseInt(str[1]) - 1;
            int r = Integer.parseInt(str[2]) - 1;
            int v = Integer.parseInt(str[3]);

            number[b][f][r] += v;
            n--;
        }
        for(int b = 0; b < 4; b++){
            for(int f = 0; f < 3; f++){
                for(int r = 0; r < 10; r++){
                    System.out.print(" "+number[b][f][r]);
                }
                System.out.println("");
            }
            if(b != 3) System.out.println("####################");
        }
    }
}