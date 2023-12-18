import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String check;
		int a, b, sum = 0, sums = 0, n = 0;
		double ave=0;
		while((check = bf.readLine()) != null){
			n++;
			String[] temp = check.split(",");
			a = Integer.parseInt(temp[0]);
			b = Integer.parseInt(temp[1]);
			sums += b;
			sum += a*b;
			ave = sums / n;
		}
		BigDecimal bd = new BigDecimal(ave);
		BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
		out.println(sum);
		out.println(ave);
		out.flush();
	}
}