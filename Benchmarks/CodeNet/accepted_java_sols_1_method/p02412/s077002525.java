import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = reader.readLine();
			String[] str = line.split(" ", -1);
			int n = Integer.parseInt(str[0]);
			int x = Integer.parseInt(str[1]);
			if(n == 0 && x == 0){
				break;
			}
			int count = 0;
			int a = 1;
			int b = 2;
			int c = 3;
			while(true){
				c = x - (a + b);
				if(c > n){
					b++;
				}else{
					if(b >= c){
						a++;
						if(a == n - 1){
							break;
						}else{
							b = a + 1;
						}
					}else{
					count++;
					b++;
					}
				}
			}
			System.out.println(count);
		}
	}
}