import java.util.* ;		

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		String s = in.nextLine();
		int result = 0;
		for (int i = 0; i < 6; i++) {
			if (s.charAt(i) == '1') {
				result++;
			}
		}
		System.out.println(result);
	}
}	