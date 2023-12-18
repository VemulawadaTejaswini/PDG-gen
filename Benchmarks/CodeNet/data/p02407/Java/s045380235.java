import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());

		if(i <= 100){

			int [] su = new int[i];
			int [] re = new int[i];

			String str = br.readLine();
			String[] s = str.split(" ");

			for(int n = 0; n < i; n++){
				su[n] = Integer.parseInt(s[n]);
			}
			for(int num = 1; num <= su.length; num++){
				if(num == su.length){
					re[num - 1] =su[i - num];
					System.out.print(re[num - 1]);
				}else{
					re[num - 1] = su[i - num];
					System.out.print(re[num - 1] + " ");
				}
			}
		}
	}
}