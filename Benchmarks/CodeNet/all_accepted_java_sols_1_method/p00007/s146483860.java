import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int n, money = 100000;
			n = Integer.parseInt(reader.readLine());
			for(int i = 0;i < n;i++) {
				money = money + (money/20);
				int x = money%10, y = money%100/10, z = money%1000/100;
				if(x != 0 || y != 0 || z != 0)
					money+=(1000-(x+y*10+z*100));
			}
			System.out.println(money);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}