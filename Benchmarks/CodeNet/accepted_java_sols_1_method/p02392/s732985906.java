import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
		String str[], ans;
		int a, b, c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);
        c = Integer.parseInt(str[2]);

        if(a < b && b < c){
        	ans = "Yes";
        }else{
        	ans = "No";
        }
        System.out.println(ans);

	}

}