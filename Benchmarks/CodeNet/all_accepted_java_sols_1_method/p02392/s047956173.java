import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);

		int a = st.nextInt();
		int b = st.nextInt();
		int c = st.nextInt();

		if((a < b) && (b < c)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}