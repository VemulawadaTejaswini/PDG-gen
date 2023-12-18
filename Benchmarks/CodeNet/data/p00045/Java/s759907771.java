import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String check;
		int a, b, sum = 0, sums = 0, n = 0;
		double ave = 0;
		while((check = bf.readLine()) != null){
			n++;
			String[] temp = check.split(",");
			a = Integer.parseInt(temp[0]);
			b = Integer.parseInt(temp[1]);
			sums += b;
			sum += a*b;
			ave = sums / n;
			if(ave % 1 > 0.4) ave++;
		}
		out.println(sum + "\n" + ave);
		out.flush();
	}
}