import java.io.*;
import java.math.*;

class Main{
	static final String[] unit = {"", "Man", "Oku", "Cho", "Kei", "Gai", "Jo", "Jou", "Ko", "Kan", "Sei", "Sai", "Gok", "Ggs", "Asg", "Nyt", "Fks", "Mts"};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		for(;;){
			String[] str = br.readLine().split(" ");
			int m = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);
			if(m == 0 && n == 0) break;
			BigInteger num = BigInteger.ONE;
			for(int i = 0; i < n; i++){
				num = num.multiply(BigInteger.valueOf(m));
			}
			String res = new String();
			for(int i = 0; i < unit.length; i++){
				BigInteger rem = num.remainder(BigInteger.valueOf(10000));
				num = num.divide(BigInteger.valueOf(10000));
				if(rem.compareTo(BigInteger.ZERO) == 0) continue;
				res = rem.toString() + unit[i] + res;
			}
			pw.println(res);
		}
		pw.close();
	}
}

