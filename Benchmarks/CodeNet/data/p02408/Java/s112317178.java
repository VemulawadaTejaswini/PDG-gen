import java.util.Scanner;
class Main {
	private static int[] S = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	private static int[] H = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	private static int[] C = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	private static int[] D = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			String j = sc.next();
			if(j.equals("S")){
				int J = sc.nextInt();
				switch(J){
				case 1:
					S[J] = S[J] - J;
				case 2:
					S[J] = S[J] - J;
				case 3:
					S[J] = S[J] - J;
				case 4:
					S[J] = S[J] - J;
				case 5:
					S[J] = S[J] - J;
				case 6:
					S[J] = S[J] - J;
				case 7:
					S[J] = S[J] - J;
				case 8:
					S[J] = S[J] - J;
				case 9:
					S[J] = S[J] - J;
				case 10:
					S[J] = S[J] - J;
				case 11:
					S[J] = S[J] - J;
				case 12:
					S[J] = S[J] - J;
				case 13:
					S[J] = S[J] - J;
				}
			}else if(j.equals("H")){
				int J = sc.nextInt();
				switch(J){
				case 1:
					H[J] = H[J] - J;
				case 2:
					H[J] = H[J] - J;
				case 3:
					H[J] = H[J] - J;
				case 4:
					H[J] = H[J] - J;
				case 5:
					H[J] = H[J] - J;
				case 6:
					H[J] = H[J] - J;
				case 7:
					H[J] = H[J] - J;
				case 8:
					H[J] = H[J] - J;
				case 9:
					H[J] = H[J] - J;
				case 10:
					H[J] = H[J] - J;
				case 11:
					H[J] = H[J] - J;
				case 12:
					H[J] = H[J] - J;
				case 13:
					H[J] = H[J] - J;
				}
			}else if(j.equals("C")){
				int J = sc.nextInt();
				switch(J){
				case 1:
					C[J] = C[J] - J;
				case 2:
					C[J] = C[J] - J;
				case 3:
					C[J] = C[J] - J;
				case 4:
					C[J] = C[J] - J;
				case 5:
					C[J] = C[J] - J;
				case 6:
					C[J] = C[J] - J;
				case 7:
					C[J] = C[J] - J;
				case 8:
					C[J] = C[J] - J;
				case 9:
					C[J] = C[J] - J;
				case 10:
					C[J] = C[J] - J;
				case 11:
					C[J] = C[J] - J;
				case 12:
					C[J] = C[J] - J;
				case 13:
					C[J] = C[J] - J;
				}
			}else if(j.equals("D")){
				int J = sc.nextInt();
				switch(J){
				case 1:
					D[J] = D[J] - J;
				case 2:
					D[J] = D[J] - J;
				case 3:
					D[J] = D[J] - J;
				case 4:
					D[J] = D[J] - J;
				case 5:
					D[J] = D[J] - J;
				case 6:
					D[J] = D[J] - J;
				case 7:
					D[J] = D[J] - J;
				case 8:
					D[J] = D[J] - J;
				case 9:
					D[J] = D[J] - J;
				case 10:
					D[J] = D[J] - J;
				case 11:
					D[J] = D[J] - J;
				case 12:
					D[J] = D[J] - J;
				case 13:
					D[J] = D[J] - J;
				}
			}
		}
		for(int x = 1; x <= 13; x++){
			if(S[x] > 0){
				System.out.println("S " + S[x]);
			}
		}
		for(int x = 1; x <= 13; x++){
			if(H[x] > 0){
				System.out.println("H " + H[x]);
			}
		}
		for(int x = 1; x <= 13; x++){
			if(C[x] > 0){
				System.out.println("C " + C[x]);
			}
		}
		for(int x = 1; x <= 13; x++){
			if(D[x] > 0){
				System.out.println("D " + D[x]);
			}
		}
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}