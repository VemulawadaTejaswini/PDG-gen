import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
		int a, b, c;
		String str[];
		int div_cnt = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);
        c = Integer.parseInt(str[2]);

        for(int i = 1; i <= c; i++){
        	if(c % i == 0){
        		for(int j = a + div_cnt; j <= b; j++){
        			if(i == j){
        				div_cnt++;
        			}
        		}
        	}
        }
        System.out.println(div_cnt);

	}

}