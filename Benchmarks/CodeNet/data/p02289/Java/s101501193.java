import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<Integer> Queue = new ArrayList<Integer>();

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int flag = 1;
			while (flag > 0) {
				String[] s = br.readLine().split(" ");
				if (s[0].equals("insert")) {
					int k = Integer.parseInt(s[1]);
					Queue.add(k);
				}
				else if (s[0].equals("extract")) {
					System.out.println(extractMax());
				}
				else {
					flag = 0;
				}
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static int extractMax() {
		int max = 0,j = 0;
		for (int i = 0; i < Queue.size(); i++) {
			int tmp = Queue.get(i);
			if (tmp > max) {
				max = tmp;
				j = i;
			}
		}
		Queue.remove(j);
		return max;
	}

}

