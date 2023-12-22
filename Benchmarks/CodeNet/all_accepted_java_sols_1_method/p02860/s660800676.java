import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String tmps = new String(in.readLine());
        int n = Integer.parseInt(tmps);
        String num = new String(in.readLine());
        String[] numarray = num.split("");
		boolean flg = true;
		if(n % 2 == 1){
			System.out.println("No");
		}else{
			for(int i = 0;i<n/2;i++){
				int tmp = n/2 + i;
				if(!numarray[i].equals(numarray[tmp])){
					flg = false;
				}
			}
			if(flg){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}