public class A {
	public static void main(String[] args) {
		 Scanner stdin = new Scanner(System.in);

		String S = stdin.nextString();
		if(S == "SSS") {
			System.out.println("0");
		}
		else if(S == "SSR" || S=="SRS" ||S=="RSS" || S=="RSR") {
			System.out.println("1");
		}
		else if(S == "SRR" || S=="RRS") {
			System.out.println("2");
		}
		else if(S == "RRR") {
			System.out.println("3");
		}
	}

}
