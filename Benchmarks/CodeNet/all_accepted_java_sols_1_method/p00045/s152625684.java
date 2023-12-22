import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String check;
		int[] a = new int[2];
		int sum = 0, sums = 0;
		float ave = 0, n = 1f;
		while((check = bf.readLine()) != null){
			String[] temp = check.split(",");
			for(int i = 0; i < 2; i++){
				a[i] = Integer.parseInt(temp[i]);
			}
			sum += a[0] * a[1];
			sums += a[1];
			ave = sums / n;
			if(ave % 1 > 0.4) ave++;
			n++;
		}
		out.println(sum + "\n" + (int)ave);
		out.flush();
	}
}