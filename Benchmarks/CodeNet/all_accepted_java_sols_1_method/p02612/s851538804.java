import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int otsuri = 10000-N;
		if(String.valueOf(otsuri).length() >= 4) {
			System.out.println(Integer.parseInt(String.valueOf(otsuri).substring(1)));
		} else {
			System.out.println(otsuri);
		}
	}
}