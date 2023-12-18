import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String check;
		int a, b, sum = 0, sums = 0, n = 0;
		int ave = 0;
		while((check = bf.readLine()) != null){
			n++;
			String[] temp = check.split(",");
			a = Integer.parseInt(temp[0]);
			b = Integer.parseInt(temp[1]);
			sums += b;
			sum += a*b;
			ave = sums / n;
		}
		System.out.println(sum);
		System.out.println(ave);
	}
}