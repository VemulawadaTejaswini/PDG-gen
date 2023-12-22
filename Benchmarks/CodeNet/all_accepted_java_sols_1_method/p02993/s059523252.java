import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String S = teclado.nextLine();
		int c = 0;
		int v[] = new int [4];
		for(int i = 0; i<4; i++) {
			v[i] = S.charAt(i);
		}
		if(v[0] == v[1] || v[1] == v[2] || v[2] == v[3]) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
		teclado.close();
		

	

	 }
}


