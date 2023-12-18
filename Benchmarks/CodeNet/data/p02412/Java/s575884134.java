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
				if(c > n){
					b++;
					if(b == 5){
						a++;
						b = a + 1;
						c = a + 2;
					}else{
						c = b + 1;
					}
				}
				if(a + b + c == x){
					count++;
				}
				if(a == n - 1){
					break;
				}
				c++;
			}
			System.out.println(count);
		 }
	}
}