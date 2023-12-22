import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        if(r-l >=2019){
            System.out.println("0\n");
            return;
        }
        int min=Integer.MAX_VALUE;

        for(int i=l+1; i<=r;i++){
            for(int j=l;j<i;j++){
                int temp = Math.floorMod(Math.floorMod(i,2019)*Math.floorMod(j,2019),2019);
                if(temp<min){
                    min=temp;
                }
            }
        }
        System.out.println(min);
        System.out.println("\n");
    }
}
