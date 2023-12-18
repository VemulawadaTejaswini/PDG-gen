public class Main {

	public static void main(String[] args) throws IOException{

		List<Integer> l = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String inputNum = br.readLine();
			if (inputNum.equals("0")) {
				break;
			}

			l.add(Integer.parseInt(inputNum));
		}

		for (Integer num : l) {
			System.out.println(num);
		}


	}

}