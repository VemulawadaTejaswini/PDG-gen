public class Main {
	
	void run() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count_a = 0;
		int count_b = 0;
		int count_c = 0;
		int count_d = 0;

		String word_line = "";
		String word = "";
		List result = new ArrayList();
		while(true) {
			word_line = br.readLine();
			if (word_line.equals(".")) break; 
			for (int j = 0; j < word_line.length(); j++) {
				word = word_line.substring(j, j + 1);
				if (word.equals("(")) {
					count_a++;
				}
				if (word.equals(")")) {
					count_b++;
				}
				if (word.equals("[")) {
					count_c++;
				}
				if (word.equals("]")) {
					count_d++;
				}
			}
			if (count_a == count_b && count_c == count_d) {
				result.add("yes");
			} else {
				result.add("no");
			}
		}
		for (int i = 0; i < result.size(); i++) {
			String answer = (String) result.get(i);
			System.out.println(answer);
		}
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}