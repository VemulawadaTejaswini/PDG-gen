import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			long n, m, result = 0;
			int ind;
			String str;
			
			str = reader.readLine();
			ind = str.indexOf(" ");
			n = Long.parseLong(str.substring(0, ind));
			m = Long.parseLong(str.substring(ind+1));
			
			if(n==1) {
				if(m==1) {
					result = 1;
				}else {
					result = m-2;
				}
			}else if(n == 2) {
				result = 0;
			}else {
				if(m==1) {
					result = n-2;
				}else if(m==2) {
					result = 0;
				}else {
					result = (n-2)*(m-2);
				}
			}
			System.out.println(result);
		}
		catch (Exception e) {
			
		}
	}

}
