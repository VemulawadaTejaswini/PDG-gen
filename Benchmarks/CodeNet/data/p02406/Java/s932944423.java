import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int n;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
        	if(CHECK_NUM(i)) continue;
        	INCLUDE_3(i);
        }
        System.out.println();
	}

	public static boolean CHECK_NUM(int x){
		if ( x % 3 == 0 ){
			System.out.print(" " + x);
			return true;
		}else{
			return false;
		}
	}

	public static void INCLUDE_3(int i){
		int x = i;
		while(x != 0){
			if ( x % 10 == 3 ){
				System.out.print(" " + i);
				break;
			}
			x /= 10;
		}
	}
}