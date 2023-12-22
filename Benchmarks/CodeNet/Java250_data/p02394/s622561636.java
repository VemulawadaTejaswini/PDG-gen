import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
		String str[], ans;
		int W, H, x, y, r;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        W = Integer.parseInt(str[0]);
        H = Integer.parseInt(str[1]);
        x = Integer.parseInt(str[2]);
        y = Integer.parseInt(str[3]);
        r = Integer.parseInt(str[4]);

        if(r <= x && x + r <= W && r <= y && y + r <= H){
        	ans = "Yes";
        }else{
        	ans = "No";
        }
        System.out.println(ans);

	}

}