import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String s = reader.readLine();
			char[] c = s.toCharArray();
			int n = c.length;
			int ans = 0;
			if(n % 2 == 0){
				for(int i = 0; i < (n / 2); i++){
					if(c[i] != c[(n - 1) - i]){
						ans ++;
					}
				}
			}else{
			for(int i = 0; i < (n - 1) / 2; i++){
				if(c[i] != c[(n - 1) - i]){
					ans ++;
				}
			}
		}
		System.out.println(ans);
		} catch(IOException e) {
			System.out.println(e);
		} 
	}
}