import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H=Integer.parseInt(sc.next());
		int N=Integer.parseInt(sc.next());
		int aaa = 0;
		for(int i=0;i<N; i++) {
			aaa += Integer.parseInt(sc.next());
		}
		if(aaa>=H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
