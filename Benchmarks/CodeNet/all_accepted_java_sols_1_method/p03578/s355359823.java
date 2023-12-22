import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		String answer = "YES";

		int N = sc.nextInt();
		//long[] D = new long[N];
		HashMap<Long, Integer> D = new HashMap<>();
		for(int i = 0; i < N; i++){
			long d = sc.nextLong();
			if(D.get(d) == null){
				D.put(d, 1);
			}else{
				D.put(d, D.get(d) + 1);
			}
		}

		int M = sc.nextInt();
		//long[] T = new long[N];

		//ArrayList<Long> T = new ArrayList<Long>();
		for(int i = 0; i < M; i++){
			//T.add(sc.nextLong());
			long t = sc.nextLong();
			if(D.get(t) == null || D.get(t) == 0){
				answer = "NO";
				break;
			}else{
				D.put(t, D.get(t) - 1);
			}
		}

		System.out.println(answer);

		//out.close();
	}
}