import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			int cup[] = {1,0,0};
			String ID = "ABC";
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf,",");
				int a = ID.indexOf(st.nextToken().charAt(0));
				int b = ID.indexOf(st.nextToken().charAt(0));

				cup[a] = cup[a]^cup[b];
				cup[b] = cup[a]^cup[b];
				cup[a] = cup[a]^cup[b];
			}
			for (int i=0;i<3;i++) {
				if (cup[i]==1) System.out.println(ID.charAt(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}