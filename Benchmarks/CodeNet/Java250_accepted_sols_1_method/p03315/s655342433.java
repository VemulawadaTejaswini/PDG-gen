class Main {
	public static void main(String[] args){
		String S = new java.util.Scanner(System.in).nextLine();
		String[] Schar = S.split("");
		int N = 0;
		for (int i = 0; i < 4; i++) {
			if (Schar[i].equals("+")) {
				N++;
			} else {
				N--;
			}
		}
		System.out.println(N);
	}
}