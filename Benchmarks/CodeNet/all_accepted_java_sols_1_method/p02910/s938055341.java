import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		String [] S = sc.next().split("");

		int i=0;
		int g=0;
		while(i<S.length) {
			if(g==0) {
				if(S[i].equals("L")) {
					g=3;
					break;
				}
			}else {
				if(S[i].equals("R")){
					g=3;
					break;
				}
			}
			i++;

			if(g==0) {
				g++;
			}else {
				g--;
			}
		}

		if(g==3) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}


	}

}
