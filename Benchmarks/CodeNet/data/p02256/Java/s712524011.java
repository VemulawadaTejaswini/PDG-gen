import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] rt = br.readLine().split(" ");
        //final String[] bCard = br.readLine().split(" ");
        //final String[] sCard = new String[bCard.length];
        //System.arraycopy(bCard, 0, sCard, 0, sCard.length);
        
        int j = gcd(Integer.parseInt(rt[0]), Integer.parseInt(rt[1]));
        System.out.println(j);
    }

    public static int gcd(int x, int y) {
        if (x < y){
            int n = y;
            y = x;
            x = n;
        }
        while (y > 0){
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
};
