import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h0 = Integer.parseInt(st.nextToken());
        int h1 = Integer.parseInt(st.nextToken());
        if (n==2){
            System.out.println(Math.abs(h0-h1));
            return;
        }
        int h2=Integer.parseInt(st.nextToken());
        int[] prevHeight = new int[2];
        prevHeight[0]=h1;
        prevHeight[1]=h2;
        int[] prevMinCost = new int[2];
        prevMinCost[0]=Math.abs(h0-h1);
        prevMinCost[1]=Math.abs(h0-h2);

        while(st.hasMoreTokens()){
            int curr=Integer.parseInt(st.nextToken());
            int currMinCost=Math.min(prevMinCost[0]+Math.abs(prevHeight[0]-curr),
                    prevMinCost[1]+Math.abs(prevHeight[1]-curr));
            prevHeight[0]=prevHeight[1];
            prevHeight[1]=curr;
            prevMinCost[0]=prevMinCost[1];
            prevMinCost[1]=currMinCost;
        }
        System.out.println(prevMinCost[1]);
    }
}
