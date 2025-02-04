import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split(" ",0);
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);
			int[] table = new int[N];
			ArrayList<Integer> al = new ArrayList<>();
			for(int i=0;i<M;i++) {
				str = br.readLine();
				s = str.split(" ",0);
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				if(a == 1) {
					al.add(b);
				}else if(b == 1) {
					al.add(a);
				}
				if(a == N) {
					table[b] = 1;
				}else if(b == N) {
					table[a] = 1;
				}
			}

			for(int i = 0;i<al.size();i++) {
				if(table[al.get(i)]==1) {
					System.out.println("POSSIBLE");
					break;
				}
				if(i == al.size()-1) {
					System.out.println("IMPOSSIBLE");
				}
			}

		}catch (Exception e) {
			System.exit(0);
		}
	}
}
