class Main {
	public static void main(String[] args){
		String N = new java.util.Scanner(System.in).nextLine();
		String[] Narray = N.split("");
		int Nnum = Integer.parseInt(N);
		int Sn = 0;
		for (int i = 0; i < Narray.length; i++) {
			Sn += Integer.parseInt(Narray[i]);
		}
		if (Nnum % Sn == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}