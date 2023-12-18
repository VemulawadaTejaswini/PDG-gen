import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		String[] str;
		int n,x;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			x = Integer.parseInt(str[1]);

			if(n==0&&x==0){
				break;
			}

			int count=0;
			for(int i=1;i< n-3;i++){
				for(int j = i + 1; j < n -1; j++){
					int num = x - i - j;
					if(num != i && num != j){
						count++;
					}
				}
			}
			System.out.println(count);
		}


	}
}