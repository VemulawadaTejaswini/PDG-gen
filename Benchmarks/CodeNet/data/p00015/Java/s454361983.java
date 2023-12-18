import java.io.*;

public class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(reader.readLine());
			boolean flag = false;
			for(int i = 0;i < n;i++) {
				String t = reader.readLine();
				String u = reader.readLine();
				if(t.length() > 80 || u.length() > 80)
					flag = true;
				String s[] = {t, u};
				int j = s[0].length()-1 >= s[1].length()-1 ? s[0].length()-1 : s[1].length()-1;
				int k = s[0].length()-1 <= s[1].length()-1 ? s[0].length()-1 : s[1].length()-1;
				int l = s[0].length()-1 >= s[1].length()-1 ? 0 : 1;
				int o;
				int a[][] = {new int[j+1], new int[k+1]};
				for(int m = 0;m < j+1;m++) {
					a[0][m] = s[l].charAt(m)-'0';
				}
				int f = Math.abs(l-1);
				for(int m = 0;m < k+1;m++) {
					a[1][m] = s[f].charAt(m)-'0';
				}
				while(j>=0) {
					if(k >= 0)
						o = a[1][k];
					else
						o = 0;
					a[0][j] = a[0][j] + o;
					if(a[0][j]>9) {
						if(j>0) {
							a[0][j] %= 10; 
							a[0][j-1]++;
						}
						else if(j==0){
							break;
						}
					}
					j--;
					k--;
				}
				if(flag || a[0].length > 80)
					System.out.print("overflow");
				else {
					for(int q = 0;q < a[0].length;q++) {
						System.out.print(a[0][q]);
					}
					System.out.println("");
					flag = false;
				}
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}