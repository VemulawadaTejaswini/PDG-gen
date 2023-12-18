import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);

        int[][][] count = new int[4][3][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    count[i][j][k] = 0;
                }
            }
        }
        //?????°?????????
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] strs = str.split(" ");
            int b = Integer.parseInt(strs[0]) - 1;  //????£?
            int f = Integer.parseInt(strs[1]) - 1;  //???
            int r = Integer.parseInt(strs[2]) - 1;  //?????????
            int v = Integer.parseInt(strs[3]);
            count[b][f][r] += v;
        }
            for (int i = 0; i < 4; i++) {
                if(i != 0){
                    System.out.println("####################");
}
                    for(int l = 0; l < 3; l++){
                        for(int k = 0; k < 10; k++){
                            System.out.print(" ");
                            System.out.print(count[i][l][k]);
                        }//for
                        System.out.println();
                    }//for
            }
        
    }
}