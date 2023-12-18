public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String p = br.readLine();
		int sLen = s.length();
		int pLen = p.length();

		boolean foundP = false;

		for(int i = 0; i < sLen; i++) {

			for(int j = 0; j < pLen; j++) {
				int k = (i + j) % sLen;
				char sc = s.charAt(k);
				char pc = p.charAt(j);

				if(sc != pc) {
					break;
				}

				if(j == pLen-1) {
					foundP = true;
					break;
				}
			}

			if(foundP) {
				break;
			}
		}

		if(foundP) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		br.close();
	}
}