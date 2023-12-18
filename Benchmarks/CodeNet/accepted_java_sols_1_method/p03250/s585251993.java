import java.util.*;

class Main {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		A.add(sc.nextInt());
		A.add(sc.nextInt());
		A.add(sc.nextInt());
		sc.close();
		Collections.sort(A);
		String ans = (""+A.get(2))+A.get(1);
		System.out.println(Integer.parseInt(ans)+A.get(0));
	}
}
