import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] bubble = new String[n];
		String[] select = new String[n];
		for (int i = 0; i < n; i++) {
			String str = st.nextToken();
			bubble[i] = str;
			select[i] = str;
		}
		int countbubble = bubblesort(bubble);
		boolean t = selectsort(select);
		StringBuilder stb = new StringBuilder(bubble[0]);
		for (int i = 1; i < n; i++)
			stb.append(" " + bubble[i]);
		System.out.println(stb+"\r\n"+"Stable");
		stb = new StringBuilder(select[0]);
		for (int i = 1; i < n; i++)
			stb.append(" " + select[i]);
		System.out.println(stb+"\r\n"+(t?"Stable":"Not stable"));

	}

	static int bubblesort(String[] in) {
		int count = 0;
		for (int i = in.length; i > 0; i--) {
			for (int j = 1; j < i; j++) {

				if (in[j - 1].charAt(1) > in[j].charAt(1)) {
					count++;
					String tmp = in[j - 1];
					in[j - 1] = in[j];
					in[j] = tmp;
				}
			}
		}
		return count;
	}

	static boolean selectsort(String[] in) {
		boolean con = true;

		for (int i = 0; i < in.length - 1; i++) {
			int mini = i;
			int t = Integer.MAX_VALUE;
			for (int j = i + 1; j < in.length; j++) {

				if (con && mini == i && in[mini].charAt(1) == in[j].charAt(1)) {
					t = j;

				}
				if (in[mini].charAt(1) > in[j].charAt(1)) {
					mini = j;
				}
			}
			if (mini != i) {

				String tmp = in[i];
				in[i] = in[mini];
				in[mini] = tmp;
				if (t < mini)
					con = false;

			}
		}
		return con;

	}
}