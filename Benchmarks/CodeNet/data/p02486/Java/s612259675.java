import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//String[] ia;
		Scanner in = new Scanner(System.in);

		while(true){
			int n = in.nextInt();
			int x = in.nextInt();
			if(n == 0 && x == 0){
				break;
			}
			int ans = 0;
			for(int i = 1;i <= n; ++i){
				for(int j = i+1;j <= n; ++j){
					for(int k = j+1;k <= n; ++k){
						if(i+k+j == x){
							++ans;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}