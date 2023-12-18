import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			int Group[] = {0,0,0,0};
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf,",");
				int n = Integer.parseInt(st.nextToken());
				String blood = st.nextToken();
				if (blood.indexOf("AB")!=-1) Group[2]++;
				else if (blood.indexOf("A")!=-1) Group[0]++;
				else if (blood.indexOf("B")!=-1) Group[1]++;
				else if (blood.indexOf("O")!=-1) Group[3]++;
			}
			for (int i=0;i<4;i++) {
				System.out.println(Group[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}