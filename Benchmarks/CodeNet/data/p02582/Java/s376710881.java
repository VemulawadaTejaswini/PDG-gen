public class RainySeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = new String();
		S="SRS";
		int count=0;
		if (S.equals("SSS")) {
			count = 0;
		} else if (S.equals("RSS") || S.equals("SSR") || S.equals("RRS")) {
			count = 2;
		} else if (S.equals("RRR")) {
			count = 3;
		} else {
			count = 1;
		}
		System.out.print(count);
	}
}