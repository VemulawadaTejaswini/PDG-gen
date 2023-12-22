import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());

		int [] su = new int[i];

		String str = br.readLine();
		String[] s = str.split(" ");

		for(int n = 0; n < i; n++){
			su[n] = Integer.parseInt(s[n]);
		}

		int max = su[0];
		int min = su[0];
		long sum = 0;

		for(int k = 0; k < su.length; k ++){
			if(max < su[k]){
				max = su[k];

			}else if (min > su[k]){
				min = su[k];
			}
			sum += su[k];
		}
		System.out.println(min+" "+max+" "+sum);
	}
}