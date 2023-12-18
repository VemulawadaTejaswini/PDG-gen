import java.io.*;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			String buf = br.readLine();
			int n = Integer.parseInt(buf);

			long money = 100000;
			for (int i=0;i<n;i++) {
				money = (money/100)*105;
				if (money%1000>0)
					money = money-money%1000+1000;
			}
			System.out.println(money);
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}