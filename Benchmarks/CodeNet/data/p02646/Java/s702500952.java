import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws Exception {
        String[] tokens = br.readLine().split(" ");
        int a= Integer.parseInt(tokens[0]);
        int v=Integer.parseInt(tokens[1]);
        tokens = br.readLine().split(" ");
        int b = Integer.parseInt(tokens[0]);
        int w = Integer.parseInt(tokens[1]);
        int t = Integer.parseInt(br.readLine());
        if(v<=w){
            System.out.println("No");
        }else{
            int rel = v-w;
            int dist = Math.abs(b-a);
            if(dist%rel==0){
                if(dist/rel<=t)
                    System.out.println("Yes");
                else System.out.println("No");
            }else {
                if(dist/rel<t)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }




}