import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter out = new PrintWriter(System.out);
    private static final char[] suites = {'S', 'H', 'C', 'D'};
    static boolean[][] cards = new boolean[4][13];
    public static void main(String[] Args) throws IOException{
        final int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            final String in = br.readLine();
            final char suit = in.charAt(0);
            final int num = Integer.parseInt(in.substring(2));
            if(suit=='S') cards[0][num-1] = true;
            else if(suit=='H') cards[1][num-1] = true;
            else if(suit=='C') cards[2][num-1] = true;
            else if(suit=='D') cards[3][num-1] = true;
        }
        for(int i = 0; i<4; i++){
            for(int j = 0; j<13; j++){
                if(!cards[i][j]) out.println(suites[i]+" "+ (j+1));
            }
        }
        out.flush();
    }
}