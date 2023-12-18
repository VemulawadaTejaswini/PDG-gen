import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] tmp = br.readLine().split(" ");
			int n = Integer.parseInt(tmp[0]);
			int x = Integer.parseInt(tmp[1]);
			if(n == 0 && x == 0){
				break;
			}
			int start = x / 3 + 1;
			int count = 0;
			for(int i = start;i <= n;i++){
				for(int j = ((start << 1) - (i + 1));j < i;j++){
					for(int k = 1;k < j;k++){
						if((i + j + k) == x){
							count++;
							break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}