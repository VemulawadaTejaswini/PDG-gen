public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		// BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		List<Integer> w = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			w.add(Integer.parseInt(br.readLine()));
		
		// O(kn^2)?????¢?????´??????????????????????????????...
		List<List<Integer>> P = new ArrayList<List<Integer>>();
		List<Integer> P0 = new ArrayList<Integer>();
		P0.add(w.get(0));
		for (int j = 1; j < n; j++)
			P0.add(P0.get(j - 1) + w.get(j));
		P.add(P0);
		for (int i = 1; i < k; i++) {
			List<Integer> Pk = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				int min = P.get(i - 1).get(j);
				int sum = 0;
				for (int l = 0; l < j; l++) {  // j??????????????????????????????l+1???????????????
					sum += w.get(j - l);
					if (min < sum)
						break;
					min = Math.max(P.get(i - 1).get(j - l - 1), sum);
				}
				Pk.add(min);
			}
			P.add(Pk);
		}
		
		System.out.println(P.get(k - 1).get(n - 1));
	}
}